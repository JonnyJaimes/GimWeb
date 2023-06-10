package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "routines")
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer duration;
    @ManyToOne
    private Trainer creator;
   
    
public Routine(Long id, String name, String description,Integer duration, Trainer creator) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.creator = creator;
	}
	public Routine() {
		
	}
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Trainer getCreator() {
		return creator;
	}
	public void setCreator(Trainer creator) {
		this.creator = creator;
	}
	

    // .. getters and setters ..
}