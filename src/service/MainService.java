package service;

import java.util.ArrayList;
import model.users.*;

public class MainService {
	
	public static ArrayList<GuestUser> allUsersInSystem = new ArrayList<>();
	
	public static void main(String[] args) {
		GuestUser gUser1 = new GuestUser();
		RegisterUser rUser1 = gUser1.guestService.register("rihards.audze", "123", "Rihards Audze", true);
		allUsersInSystem.add(rUser1);
		
		GuestUser gUser2 = new GuestUser();
		RegisterUser rUser2 = gUser2.guestService.register("mani.ziedi", "321", "SIA Mani Ziedi", false);
		allUsersInSystem.add(rUser2);
		
		GuestUser gUser3 = new GuestUser();
		RegisterUser rUser3 = gUser3.guestService.register("manas.masinas", "321", "SIA Manas Masinas", false);
		allUsersInSystem.add(rUser3);
		
		System.out.println(gUser.guestService.searchBusinessUser("Ziedi"));
		try {
			System.out.println(RegisterUser.registerUserService.signIn("rihards.audze", "1234"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
