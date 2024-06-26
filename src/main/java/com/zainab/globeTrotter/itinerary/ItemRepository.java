package com.zainab.globeTrotter.itinerary;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends MongoRepository<ItineraryItem, ObjectId> {

}
