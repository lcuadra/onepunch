package com.uam.onepunch.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uam.onepunch.model.Producto;
import com.uam.onepunch.repository.ICategoriaRepository;
import com.uam.onepunch.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Service
@Component("ServiceProducto")
public class impServiceProducto implements IServiceProducto{

    @Autowired
    private IProductoRepository repoProd;


    @Value("${ruta.archivos.imagen}")
    private String ruta;

    @Autowired
    private ICategoriaRepository repoCat;

    @Override
    public List<Producto>  getListProducto(){
        return repoProd.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return repoProd.findById(id).get()  ;
    }

    @Override
    public Producto saveProducto(String ProductDto, MultipartFile image) throws IOException {
        byte[] imgByte = image.getBytes();
        Path path = Paths.get (ruta + "//" + image.getOriginalFilename());
        if (!Files.exists(path)) {
            Files.write(path, imgByte);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        Producto product = objectMapper.readValue(ProductDto, Producto.class);
        product.setImagen(image.getOriginalFilename());
        return repoProd.save(product);
    }

    @Override
    public void deleteProducto(Long id) throws IOException {
        Producto producto = repoProd.findById(id).get();
        Files.deleteIfExists(Paths.get (ruta + "//" + producto.getImagen()));
        repoProd.deleteById(id);
    }

}
