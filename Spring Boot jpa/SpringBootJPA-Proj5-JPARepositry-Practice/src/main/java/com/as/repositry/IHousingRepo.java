package com.as.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.entity.Housing;

public interface IHousingRepo extends JpaRepository<Housing, Long> {
    // --- Find by Address ---
    public List<Housing> findByAddressEquals(String address);
    public List<Housing> findByAddressIs(String address);
    public List<Housing> findByAddress(String address);

    // --- Price Range Queries ---
    public List<Housing> findByPriceBetween(Double start, Double end);
    public List<Housing> findByPriceGreaterThanEqualAndPriceLessThanEqual(Double start, Double end);

    // --- Sorting by City ---
    public List<Housing> findByCityInOrderByAddressDesc(List<String> cities);

    // --- OwnerName String Matching ---
    public List<Housing> findByOwnerNameStartingWith(String initChars);
    public List<Housing> findByOwnerNameEndingWith(String lastChars);
    public List<Housing> findByOwnerNameContaining(String chars);
    public List<Housing> findByOwnerNameEqualsIgnoreCase(String name);

    // --- Complex Queries ---
    public List<Housing> findByAddressLikeAndBedroomsIn(String chars, List<Integer> bedrooms);
    public List<Housing> findByCityNotInOrStateNotLike(List<String> notCities, String notState);

}
