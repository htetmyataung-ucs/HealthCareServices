package com.htet.ucs.HealthCareServices.service.mapper;

import javax.transaction.Transactional;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.model.HospitalDetail;
@Transactional
public class HospitalDetailConverter {
//	@Autowired
//	static
//	ServletContext serveletContext;
//	public static String UPLOAD_DIRECTORY="/images/";
//	
//	public static HospitalDetail convertToEntity(HospitalDetailDTO hdDTO) {
//		HospitalDetail hd = new HospitalDetail();
//		
//		if(hdDTO!=null && hdDTO.getFile()!=null){
//			String path=serveletContext.getRealPath(UPLOAD_DIRECTORY);
//			String filename=hdDTO.getFile().getOriginalFilename();
//			System.out.println(path+" "+filename);
//			try {
//				byte[] bytes=hdDTO.getFile().getBytes();
//				BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
//		                 new File(path + File.separator + filename)));  
//		            stream.write(bytes);  
//		            stream.flush();  
//		            stream.close();
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//			hd.setPhotoPath(filename);
//		
//			
//		if(hdDTO!=null && hdDTO.getFile()!=null) {
//			hd.setPhotoPath(fileUpload(hdDTO.getFile()));
//		}
//		hd.setPhone(hdDTO.getPhone());
//		hd.setAddress(hdDTO.getAddress());
//		hd.setDate(hdDTO.getDate());
//		hd.setTime(hdDTO.getTime());
//		hd.setLatitude(hdDTO.getLatitude());
//		hd.setLongitude(hdDTO.getLongitude());
//		hd.getHospital().setId(hdDTO.getHospitalId());	
//		}
//		return hd;
//	}
	
	public static HospitalDetailDTO convertToDTO(HospitalDetail hdDTO) {
		HospitalDetailDTO hd = new HospitalDetailDTO();
		hd.setId(hdDTO.getId());
		hd.setPhone(hdDTO.getPhone());
		hd.setAddress(hdDTO.getAddress());
		hd.setDate(hdDTO.getDate());
		hd.setTime(hdDTO.getTime());
		hd.setEmail(hdDTO.getEmail());
		hd.setLatitude(hdDTO.getLatitude());
		hd.setLongitude(hdDTO.getLongitude());
		hd.setHospitalId(hdDTO.getHospital().getId());
		hd.setHospitalName(hdDTO.getHospital().getName());
		hd.setPhotoPath(hdDTO.getPhotoPath());
		return hd;
	}
	
//	public static String fileUpload(MultipartFile file) {		
//			String path=serveletContext.getRealPath(UPLOAD_DIRECTORY);
//			String filename=file.getOriginalFilename();
//			System.out.println(path+" "+filename);
//			if(file!=null) {
//			try {
//				byte[] bytes= file.getBytes();
//				BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
//		                 new File(path + File.separator + filename)));  
//				 stream.write(bytes);  
//		            stream.flush();  
//		            stream.close();
//		            return filename;
//			}catch(Exception e) {
//				System.out.println(e);
//			}	
//			}
//		return filename;
//		
//	}
}
