package OneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailAccountService {
	
	@Autowired
	private MailAccountRepository mailAccountRepository;
	
	public MailAccount save(MailAccount mailAccount) {
		return mailAccountRepository.save(mailAccount);
	}
	
	public List<MailAccount> readAll(){
		return (List<MailAccount>) mailAccountRepository.findAll();
	}
	
	public MailAccount read(Integer id) {
		return mailAccountRepository.findById(id).get();
	}
	
	public Integer delete(Integer id) {
		mailAccountRepository.deleteById(id);
		return id;
	}
	
}
