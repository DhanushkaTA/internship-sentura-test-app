package lk.ijse.test.dto;

import java.util.List;

public class UserDto {
//    {
//        "id": "0001",
//            "uid": "u001",
//            "display_name": "string",
//            "email": "asd@gmail.com",
//            "given_name": "string",
//            "middle_name": "string",
//            "name": "string",
//            "family_name": "string",
//            "nickname": "string",
//            "phone_number": "string",
//            "comment": "string",
//            "directory_id": 10,
//            "picture_id": "integer",
//            "avatar_url": "string",
//            "metadata": null,
//            "tags": [
//        "string"
//  ],
//        "presence": "string",
//            "created_at": "string",
//            "modified_at": "string",
//            "is_suspended": false,
//            "is_trashed": false
//    }

    private int id;
    private String uid;
    private String display_name;
    private String email;
    private String given_name;
    private String middle_name;
    private String name;
    private String family_name;
    private String nickname;
    private String phone_number;
    private String comment;
    private int directory_id;
    private int picture_id;
    private String avatar_url;
    private Object metadata;

    private List tags;
}
