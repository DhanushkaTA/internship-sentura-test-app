package lk.ijse.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RequiredArgsConstructor
public class UserDto {

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

    private String presence;
    private String created_at;
    private String modified_at;
    private boolean is_suspended;
    private boolean is_trashed;
}
