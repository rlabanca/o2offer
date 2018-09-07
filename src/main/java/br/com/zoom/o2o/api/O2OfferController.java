package br.com.zoom.o2o.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zoom.o2o.model.dto.O2offer;
import br.com.zoom.o2o.repository.O2offerRepository;


@RestController("/o2offer")
public class O2OfferController {

	@Autowired
	private O2offerRepository repository;
	
	@RequestMapping
	public List<O2offer> get( @RequestParam(name="ean", required=true) String ean
							, @RequestParam(name="latitude", required=true) double latitude
							, @RequestParam(name="longitude", required=true) double longitude
							, @RequestParam(name="max_distance", required=false, defaultValue="5km") String distance
			) {
		
		return repository.findByEanAndLocation(ean, latitude, longitude, distance, null);
		
	}
	
}
