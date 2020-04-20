package member.profile.dao;

import java.util.List;

import member.profile.dto.ProfileDto;

public interface ProfileDao {
	public ProfileDto getProfile(String id);

	// 전체 출력 --> 관리자 사용
	public List<ProfileDto> selectList_Profile();

	// 멘토만 출력(멘토 관련 정보만 뽑을것) --> 관리자 사용, 멘토찾기 사용
	public List<ProfileDto> selectList_Mentor();

	// 멘티만 출력(멘티 관련 정보만 뽑을것) --> 관리자 사용
	public List<ProfileDto> selectList_Mentee();

	// 전체에서 이름으로 검색 >> 이름과 id를 가져오자
	public List<ProfileDto> search_Member(String memberName);

	// 멘토에서 이름으로 검색 >>
	public List<ProfileDto> search_Mentor(String memberName);

	// 멘티에서 이름으로 검색 >>
	public List<ProfileDto> search_Memtee(String memberName);

	// 멘토에서 아이디로 멘티 검색
	public List<ProfileDto> search_Mentor_Mentee(String id);

// 위에 가져온 id를 통해 유저정보 디테일 페이지에서는 join한 값을 가져온다.

	// 선택 하나 출력(id 사용) --> 각각 프로필에 사용(
	// 멘토용
	public ProfileDto selectOne_Mentor(String id);

	// 멘티용
	public ProfileDto selectOne_Mentee(String id);

	// 멘토 프로필 입력
	public int insertProfile_Mentor(ProfileDto profileDto);

	// 멘티 프로필 입력
	public int insertProfile_Mentee(ProfileDto profileDto);

	// 멘토 프로필 수정
	public int updateProfile_Mentor(ProfileDto profileDto);

	// 멘티 프로필 수정
	public int updateProfile_Mentee(ProfileDto profileDto);

	/* 박하 결제 */
	// 멘토찾기 페이지 (멘토 프로필 리스트)
	public List<ProfileDto> getMentorList();

	// 결제 후 해당 멘토의 코인++
	public int updateProfilePay(String id);

	// 멘토찾기 페이지 (멘토 검색기능)
	public List<ProfileDto> searchMentor(String name);
	
	//핸드폰 번호 중복체크
	public boolean phoneCheck(String profilePhoneNumber);
	
	//멘티 이미지 경로 추가
	public int UpdateSrc_Mentor(ProfileDto profileDto);
	
}
