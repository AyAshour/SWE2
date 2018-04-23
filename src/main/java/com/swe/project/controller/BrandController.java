package com.swe.project.controller;

import com.swe.project.entity.Brand;
import com.swe.project.entity.Product;
import com.swe.project.repository.BrandRepository;
import com.swe.project.repository.ProductRepository;
import com.swe.project.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin
@RestController
@RequestMapping(value = "/brand")
public class BrandController {
    @Autowired
    private BrandRepository brandRepo;

    @Autowired
    private ProductController productController;

    @Autowired
    private BrandService brandService;


    @PostMapping("/addBrand")
    @ResponseBody
    ResponseEntity<?> addBrand(@RequestParam  String brandName) {
        return brandService.addBrand(brandName);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<?> getAllBrands() {
        return brandService.getAllBrands();
    }



  /*  @PostMapping("/viewMostOrdered" )
    public Brand mostOrderedBrand() {
        Iterable<Product> products = productController.getProductsOutOfStock();
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        Integer mxOrderedBrand = 0;
        Brand ret = new Brand();
        for(Product p:products) {
            Integer id = p.getBrandId();
            Brand brand = brandRepo.findById(id);
            String name = brand.getName();
            if(!mp.containsKey(name)) {
                mp.put(name, 1);
            }
            else {
                mp.put(name,mp.get(name)+1);
            }
            if(mxOrderedBrand<mp.get(name)){
                mxOrderedBrand = Math.max(mxOrderedBrand,mp.get(name) );
                ret = brand;
            }
        }
        return ret;
    }
*/
}
