import org.springframework.data.jpa.repository.JpaRepository;

public interface GithubActivationRepository extends JpaRepository<GithubActivation, Long> {
 
    public GithubActivation findByGithubCredentials(String githubCredentials);
 
    public void saveGithubActivation(GithubActivation githubActivation);
 
    public void deleteGithubActivation(GithubActivation githubActivation);
 
    public void updateGithubActivation(GithubActivation githubActivation);
 
}