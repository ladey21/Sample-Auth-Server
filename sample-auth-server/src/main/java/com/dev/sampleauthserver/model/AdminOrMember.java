package com.dev.sampleauthserver.model;

public interface AdminOrMember {
    default Member getMember(){
        return returnMemberSelf();
    }

    default Admin getAdmin(){
        return returnAdminSelf();
    }

    String nameValue();

    Admin returnAdminSelf();

    Member returnMemberSelf();

    default String checkAdminOrMember(){
        return nameValue();
    }

}
