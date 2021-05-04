package adaptor;

import java.rmi.RemoteException;

import Entities.Customer;
import interfaces.UserValidationService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements UserValidationService{

	@Override
	public boolean validate(Customer customer) {
		KPSPublicSoapProxy kpsPublic=new KPSPublicSoapProxy();

		try {
			return kpsPublic.TCKimlikNoDogrula(customer.NationalityId, 
					customer.firstName.toUpperCase(),
					customer.lastName.toUpperCase(),customer.DateofBirth.getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	}


