package service.impl;

import model.Post;
import model.users.PrivateUser;
import service.IPrivateUserService;

public class PrivateUserServiceImpl extends RegisterUserServiceImpl implements IPrivateUserService {

	private PrivateUser pUser;
	
	public PrivateUserServiceImpl(PrivateUser pUser) {
		//TODO verification
		this.pUser = pUser;
	}
	
	@Override
	public void addNewPrivatePost(String msg, String title) {
		//TODO verification
		Post newPost = new Post(msg, title);
		pUser.getPrivatePosts().add(newPost);
	}
	
	@Override
	public void addNewPublicPost(String msg, String title) {
		//TODO verification
		Post newPost = new Post(msg, title);
		pUser.getPublicPosts().add(newPost);
	}
	
	//TODO finish later
	@Override
	public boolean addFollower(String followerUserName) {
		
		//iet cauri visiem lietotaajiem
		//izfiltreet tikai registreetos
		//paarbaudiit vai registreetaa lietotaaja lietotaajvaards sakriit ar followerUserName
		//ja sakriit, tad pUser followers sarakstam pievienot atrasto lietotaaju
		return false;
	}
}
