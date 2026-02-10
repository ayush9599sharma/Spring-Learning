package in.pwskills.nitin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.nitin.beans.CustomerBO;
import in.pwskills.nitin.beans.CustomerDTO;
import in.pwskills.nitin.dao.ICustomerDao;


@Component("service")
public final class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao dao; 
	
	@Override
	public String CalculateSimpleInterest(CustomerDTO dto) throws Exception {
		//calculate  SI for the given dto object
		float si = (dto.getPamt() * dto.getRate() * dto.getTime())/100.0f;
		
		
		// create business object from DTO
		CustomerBO bo = new CustomerBO();
		 bo.setCustName(dto.getCustName());
		 bo.setCustAddr(dto.getCustAddr());
		 bo.setPamt(dto.getPamt());
		 bo.setRate(dto.getRate());
		 bo.setTime(dto.getTime());
		 
		 bo.setInterestAmount(si);
		 
		 int count  = dao.insert(bo);
		return count!=0 ? "customer registered successfully with the interest amount :: "+ si : "customer registration failed";
	}

}
