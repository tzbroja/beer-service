/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tzbroja.beerservice.services;

import com.tzbroja.beerservice.model.BeerDto;
import com.tzbroja.beerservice.model.BeerPagedList;
import com.tzbroja.beerservice.model.BeerStyleEnum;
import java.util.UUID;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author Tomasz Zbroja <tomasz.zbroja@gmail.com>
 */
public interface BeerService {
    
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);    
}
