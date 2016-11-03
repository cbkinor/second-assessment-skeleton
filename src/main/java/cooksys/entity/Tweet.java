package cooksys.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Tweets")
public class Tweet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="author")
	@JsonIgnore
	private User author;
	
	@ManyToMany(mappedBy = "tweets")
	private List<Hash> hashs;
	
	@Column(nullable = false)
	private String posted;
	
	@Column
	private String content;
	
	@Column
	private String inReplyTo;
	
	@Column
	private String repostOf;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getInReplyTo() {
		return inReplyTo;
	}

	public void setInReplyTo(String inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public String getRepostOf() {
		return repostOf;
	}

	public void setRepostOf(String repostOf) {
		this.repostOf = repostOf;
	}

	public List<Hash> getHashs() {
		return hashs;
	}

	public void setHashs(List<Hash> hashs) {
		this.hashs = hashs;
	}
	
	

}
