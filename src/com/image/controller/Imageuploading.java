package com.image.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/imageUpload")
public class Imageuploading extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String image = request.getParameter("image");
		FileInputStream fis = new FileInputStream(new File(image));
		Connection con = Dataconnection.getConnection();
		try {
			PreparedStatement ps= con.prepareStatement("insert into image(id,imagee)values(?,?)");
			//int n = ps.executeUpdate();
			ps.setString(1, id);
			ps.setBinaryStream(2, fis);
			int n = ps.executeUpdate();
			if(n>0)
			{
				response.getWriter().println("successfully uploaded");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
