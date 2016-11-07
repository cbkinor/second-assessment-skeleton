package cooksys.entity;

import java.util.Date;
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
	
	@Column(insertable = false, updatable = true, nullable = false)
	private boolean deleted;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="author")
	@JsonIgnore
	private User author;
	
	@ManyToMany(mappedBy = "tweets")
	private List<HashTag> hashTags;
	
	@ManyToMany(mappedBy = "mentioned")
	@JsonIgnore
	private List<User>mentions;
	
	@Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false, nullable = false)
	private Date posted;
	
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

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public List<HashTag> getHashTags() {
		return hashTags;
	}

	public void setHashTags(List<HashTag> hashTags) {
		this.hashTags = hashTags;
	}

	public List<User> getMentions() {
		return mentions;
	}

	public void setMentions(List<User> mentions) {
		this.mentions = mentions;
	}

	

}
