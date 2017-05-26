
package pojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "label",
    "ref",
    "sha",
    "user",
    "repo"
})
public class Base implements Serializable
{

    @JsonProperty("label")
    private String label;
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("user")
    private User__ user;
    @JsonProperty("repo")
    private Repo_ repo;
    private final static long serialVersionUID = 3438195395539232950L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Base() {
    }

    /**
     * 
     * @param ref
     * @param sha
     * @param repo
     * @param label
     * @param user
     */
    public Base(String label, String ref, String sha, User__ user, Repo_ repo) {
        super();
        this.label = label;
        this.ref = ref;
        this.sha = sha;
        this.user = user;
        this.repo = repo;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    @JsonProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonProperty("user")
    public User__ getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User__ user) {
        this.user = user;
    }

    @JsonProperty("repo")
    public Repo_ getRepo() {
        return repo;
    }

    @JsonProperty("repo")
    public void setRepo(Repo_ repo) {
        this.repo = repo;
    }

}
