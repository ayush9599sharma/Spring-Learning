package in.pwskills.nitin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.pwskills.nitin.beans.CustomerDTO;
import in.pwskills.nitin.beans.CustomerVo;

import in.pwskills.nitin.service.ICustomerService;

@Controller("controller")
public final class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	public String processCustomer(CustomerVo vo) throws Exception{
		//converting vo to dto for service layer
		
		CustomerDTO dto= new CustomerDTO();
		
		dto.setCustName(vo.getCustName());
		dto.setCustAddr(vo.getCustAddr());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		
		return service.CalculateSimpleInterest(dto);
		
	}
}
