package cooksys.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "hashes")
public class Hash {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(updatable = false, nullable = false)
	private String label;
	
	@Column(updatable = false, nullable = false)
	private String firstUsed;
	
	@Column(nullable = false)
	private String lastUsed;
	
	@ManyToMany
	@JoinTable(name = "hash_tweets",
		joinColumns = @JoinColumn(name = "hash_id"),
		inverseJoinColumns = @JoinColumn(name ="tweet_id"))
	@JsonIgnore
    private List<Tweet> tweets;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getFirstUsed() {
		return firstUsed;
	}

	public void setFirstUsed(String firstUsed) {
		this.firstUsed = firstUsed;
	}

	public String getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}
}
