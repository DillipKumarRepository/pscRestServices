package pscglobalsolutions.api.services;

import java.util.ArrayList;
import java.util.List;

import pscglobalsolutions.api.manager.ContactsManager;
import pscglobalsolutions.api.model.ContactInfo;
import pscglobalsolutions.api.model.ContactInfoResponse;
import pscglobalsolutions.api.model.UserInfoRequest;


public class PSCAPIServiceImpl implements PSCAPIService  {
	
	/*@Autowired 
	private ContactsManager contactManager;*/

	
	public ContactInfoResponse getContacts(final UserInfoRequest userInfo){
		try {
			List<ContactInfo> contactInfoList = new ArrayList<ContactInfo>();
            String emailAddress = userInfo.getEmailAddress();
            String password = userInfo.getPassword();
            ContactInfo contactInfo = null;
            /*contactInfoList = contactManager.getContacts(emailAddress, password);*/
            
            
            if(emailAddress.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfo = new ContactInfo();
            	contactInfo.setContactFirstName("Dillip");
            	contactInfo.setContactLastName("Das");
            	contactInfo.setContactEmailAddress("tech.dillip@yahoo.com");
            	contactInfoList.add(contactInfo);
            }
            if(emailAddress.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfo = new ContactInfo();
            	contactInfo.setContactFirstName("Sai");
            	contactInfo.setContactLastName("Teja");
            	contactInfo.setContactEmailAddress("saiteja@yahoo.com");
            	contactInfoList.add(contactInfo);
            }
            if(emailAddress.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfo = new ContactInfo();
            	contactInfo.setContactFirstName("Anil");
            	contactInfo.setContactLastName("Kumar");
            	contactInfo.setContactEmailAddress("anilkumar@yahoo.com");
            	contactInfoList.add(contactInfo);
            }
            if(emailAddress.equalsIgnoreCase("tech.dillip111@gmail.com") && password.equalsIgnoreCase("dillip")){
            	contactInfo = new ContactInfo();
            	contactInfo.setContactFirstName("Murali");
            	contactInfo.setContactLastName("Kumar");
            	contactInfo.setContactEmailAddress("murali333@gmail.com");
            	contactInfoList.add(contactInfo);
            }
            ContactInfoResponse response = new ContactInfoResponse();
            response.setContactInfo(contactInfoList);
            return response;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
		
	}

	/*public UserInfo loginViaApp(UserInfoRequest userInfo2) {
		return null;
	}*/
	
	 
}
