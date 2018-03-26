package pl.ireneuszderucki.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ContractTypeServiceImpl implements ContractTypeService{

	@Override
	public List<String> getContractTypes() {
		List<String> contractTypes = new ArrayList<>();
		contractTypes.add("Contract of employment");
		contractTypes.add("Fee-for-task agreement");
		contractTypes.add("B2B");
		return contractTypes;
	}
	

}
