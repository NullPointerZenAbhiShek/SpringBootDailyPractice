package com.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.in.entity.Housing;
import com.in.service.IHousingService;

@RestController  // Use @RestController for JSON responses
@RequestMapping("/api/houses") // Base path for all endpoints
public class HousingManagementController {

    @Autowired
    private IHousingService service;

    // Search by price range
    @GetMapping("/search/price")
    public ResponseEntity<List<Housing>> searchByPriceRange(
            @RequestParam Double start,
            @RequestParam Double end) {
        List<Housing> results = service.searchHouseByHousePriceRange(start, end);
        return ResponseEntity.ok(results);
    }

    // Search all houses by cities
    @GetMapping("/search/cities")
    public ResponseEntity<List<Housing>> searchByCities(@RequestParam List<String> cities) {
        List<Housing> results = service.searchAllHousesByCities(cities);
        return ResponseEntity.ok(results);
    }

    // Search selected house data by cities (multiple columns)
    @GetMapping("/search/cities/data")
    public ResponseEntity<List<Object[]>> searchDataByCity(@RequestParam List<String> cities) {
        List<Object[]> results = service.searchAllHousesDataByCity(cities);
        return ResponseEntity.ok(results);
    }

    // Search only states by cities
    @GetMapping("/search/cities/states")
    public ResponseEntity<List<String>> searchStatesByCity(@RequestParam List<String> cities) {
        List<String> results = service.searchAllHousesStateNameByCity(cities);
        return ResponseEntity.ok(results);
    }
}
