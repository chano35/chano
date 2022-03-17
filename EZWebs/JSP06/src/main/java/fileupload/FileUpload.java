/*
 * https://commons.apache.org/proper/commons-fileupload/apidocs/org/apache/commons/fileupload/disk/DiskFileItemFactory.html
 */
package fileupload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/fileupload")
public class FileUpload extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		File uploadDirPath = new File("D:\\Temp\\upload");
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(uploadDirPath);	// 파일을 저장할 디렉터리
		factory.setSizeThreshold(1024 * 1024);	// 1MB
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		try {
			List<FileItem> items = upload.parseRequest(request);	// 파라미터를 List 객체로 얻음(request.getParameter)
			
			for(int cnt=0; cnt < items.size(); cnt++) {
				FileItem fileItem = items.get(cnt);
				if(fileItem.isFormField() != true) {
					if(fileItem.getSize() > 0) {
						int index = fileItem.getName().lastIndexOf("\\");	// Windows
						if(index == -1) {
							index = fileItem.getName().lastIndexOf("/");	// Unix
						}
						
						// System.out.printf("[Fileupload] getFielName(%s), getName(%s), index(%d)\n",	fileItem.getFieldName(), fileItem.getName(), index);
						
						String filename = fileItem.getName().substring(index + 1);	// 풀패스에서 파일만 추출
						String filepath = uploadDirPath + "\\" + filename;			// 파일 저장 위치
						File uploadFile = new File(filepath);
						fileItem.write(uploadFile);
						System.out.printf("[Fileupload] fieldname(%s), getName(%s), filesize(%d), writepath(%s)\n", 
								fileItem.getFieldName(), fileItem.getName(), fileItem.getSize(), filepath);
					}
				}
				else {
					System.out.printf("fieldname(%s)(%s)\n", fileItem.getFieldName(), fileItem.getString("UTF-8"));
				}
			}
		}
		catch(Exception e) {
			System.out.println("[Fileupload] Exception:" + e.getMessage());
		}
	}

}
