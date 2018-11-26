package Travel.Hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Travel.Hotel.Dao.HotelDao;

@Controller
public class HotelController {
	
	@Autowired
	private HotelDao hotelDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView ("home");
		mv.addObject("hotellist", hotelDao.findAll());
		return mv;
	

	}

//	@RequestMapping("/menu")
//	public ModelAndView showMenu() {
//		ModelAndView mv = new ModelAndView ("menu");
//		mv.addObject("zootedmenu", menuItemDao.findAll());
//		//mv.addObject menu items.get all items talk to sophia about this
//		return mv;
//	}
	
	//after making the dao, use this above format to get the hotel dao express lang to go into the
	//jsp
	
	@RequestMapping("/result")
	public ModelAndView showResult(@RequestParam("hotels") String hotels) {
		ModelAndView mv = new ModelAndView ("result", "hotels",hotels);
		
		return mv;
	}
	
	
}
