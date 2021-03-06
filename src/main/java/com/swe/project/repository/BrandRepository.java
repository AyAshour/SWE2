package com.swe.project.repository;

import com.swe.project.entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand,Integer> {
    boolean existsByName(String  name);
    Brand findBrandByBrandId(Integer brandId);
}
