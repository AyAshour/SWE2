package com.swe.project.repository;

import com.swe.project.entity.Product;
import com.swe.project.entity.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {
    Iterable<Store> findStoresByAccepted(boolean accepted);
    Store findByStoreId(Integer storeId);

}
