package pl.ireneuszderucki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.ireneuszderucki.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}
