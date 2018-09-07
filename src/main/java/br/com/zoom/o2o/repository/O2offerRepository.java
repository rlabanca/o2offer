package br.com.zoom.o2o.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.zoom.o2o.model.dto.O2offer;

public interface O2offerRepository extends ElasticsearchRepository<O2offer, String> {

	//"sort\":[{\"_geo_distance\":{\"location\":{\"lat\" :?1,\"lon\":?2},\"order\":\"asc\",\"unit\":\"m\",\"mode\":\"min\",\"distance_type\":\"arc\",\"ignore_unmapped\": true}}]}
	
	@Query("{\"bool\":{\"must\":{\"match\":{\"ean\":\"?0\"}},\"filter\":{\"geo_distance\":{\"distance\":\"?3\",\"location\":{\"lat\":?1,\"lon\":?2}}}}}")
	public List<O2offer> findByEanAndLocation(String ean, double latitude, double longitude, String distance, Pageable pageable);
	
}
