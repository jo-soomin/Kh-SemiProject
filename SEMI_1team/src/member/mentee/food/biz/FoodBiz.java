package member.mentee.food.biz;

import java.util.List;

import member.mentee.dayMenu.dto.DayMenuDto;
import member.mentee.food.dto.FoodDto;

public interface FoodBiz {
	public List<FoodDto> selectList_food();
	public List<String> selectList_foodName();
	public FoodDto selectOne_food(String foodName);
	public int insert_food(FoodDto fooddto); 
}
