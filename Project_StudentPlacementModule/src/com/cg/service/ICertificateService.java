package com.cg.service;

import com.cg.entities.Certificate;

public interface ICertificateService {
	
	    void addCertificate(Certificate certificate) ;
		void updateCertificate(Certificate ertificate);
		void searchCertificate(long id);
		void deleteCertificate(long id);

}
