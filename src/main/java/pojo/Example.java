
package pojo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "action",
    "number",
    "pull_request",
    "repository",
    "sender",
    "installation"
})
public class Example implements Serializable
{

    @JsonProperty("action")
    private String action;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("pull_request")
    private PullRequest pullRequest;
    @JsonProperty("repository")
    private Repository repository;
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("installation")
    private Installation installation;
    private final static long serialVersionUID = 4961265167798131961L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Example() {
    }

    /**
     * 
     * @param installation
     * @param sender
     * @param repository
     * @param action
     * @param number
     * @param pullRequest
     */
    public Example(String action, Integer number, PullRequest pullRequest, Repository repository, Sender sender, Installation installation) {
        super();
        this.action = action;
        this.number = number;
        this.pullRequest = pullRequest;
        this.repository = repository;
        this.sender = sender;
        this.installation = installation;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("pull_request")
    public PullRequest getPullRequest() {
        return pullRequest;
    }

    @JsonProperty("pull_request")
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    @JsonProperty("repository")
    public Repository getRepository() {
        return repository;
    }

    @JsonProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @JsonProperty("sender")
    public Sender getSender() {
        return sender;
    }

    @JsonProperty("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @JsonProperty("installation")
    public Installation getInstallation() {
        return installation;
    }

    @JsonProperty("installation")
    public void setInstallation(Installation installation) {
        this.installation = installation;
    }

}
