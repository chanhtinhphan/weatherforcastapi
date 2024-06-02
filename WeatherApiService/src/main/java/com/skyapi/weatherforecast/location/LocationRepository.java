package com.skyapi.weatherforecast.location;

import com.skyapi.weatherapicommon.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location,String> {

}
