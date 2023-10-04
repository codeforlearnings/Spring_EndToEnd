package OneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mail")
public class MailAccountController {

	@Autowired
	private MailAccountService mailAccountService;
	
	@PostMapping
	public MailAccount save(@RequestBody MailAccount mailAccount) {
		return mailAccountService.save(mailAccount);
	}
	@GetMapping
	public List<MailAccount> readAll(){
		return mailAccountService.readAll();
	}
	@GetMapping("/{id}")
	public MailAccount read(@PathVariable Integer id) {
		return mailAccountService.read(id);
	}
	@DeleteMapping("/{id}")
	public Integer delete(@PathVariable Integer id) {
		return mailAccountService.delete(id);
	}
}
