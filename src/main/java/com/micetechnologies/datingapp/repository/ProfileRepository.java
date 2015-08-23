package com.micetechnologies.datingapp.repository;

import com.micetechnologies.datingapp.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by jgonzalezd on 8/23/15.
 */
@RepositoryRestResource
public interface ProfileRepository extends CrudRepository<Profile,Integer> {
}
