package com.magicbricks_teststeps;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.magicbricks_help1.Magicbricks_pagefactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teststeps {
	private WebDriver driver;
	private Magicbricks_pagefactory magic;
	FileInputStream FRead;  
    FileOutputStream FWrite;
    XSSFWorkbook wb;
    XSSFSheet sh;
    String pass="Test case is Passed";
    String fail="Test case is Failed";
    int rowval, rowcount;
	
    @Before
    public void openBrowser() throws Exception{
        //launching web browser....
        System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();      
       
        //magicbrics= new Magicbrickspagefactory(driver);
        magic=PageFactory.initElements(driver, Magicbricks_pagefactory .class);        

        //reading file from excel....
        FRead= new FileInputStream("./excel data/sprint_2.xlsx");
        wb=new XSSFWorkbook(FRead);
    }

    @Given("User is on home page")
    public void user_is_on_home_page() throws Exception {
    	System.out.println("User is on home page");
    	driver.navigate().to("https://www.magicbricks.com/");	
    	//options.addArguments("--disable-notifications");
    	//System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");
    	//driver =new ChromeDriver(options);
    	//driver.manage().window().maximize();
    	Thread.sleep(3000);
	
		}

	//@When("Mouse hover on help")
	//public void mouse_hover_on_help() throws Exception {
	//	WebElement uname2= driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[7]/a"));
     //   Actions act2= new Actions(driver);
     //   act2.moveToElement(uname2).build().perform();
     //   Thread.sleep(100000);
	//}

    //sh= wb.getSheet("User_Prefernce");
    //String City =sh.getRow(1).getCell(0).getStringCellValue();
    
	@When("Click on help")
	public void click_on_help() throws Exception {
		System.out.println("Click on help");
		magic.click_help();
		Thread.sleep(1500);
	    //driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[7]/a")).click();
	}

	@When("Click on help center")
	public void click_on_help_center() throws Exception {
		//driver.findElement(By.xpath("//*[@id=\\\"commercialIndex\\\"]/header/section[2]/div/ul/li[7]/div/div/div/ul/li[1]/a")).click();
		System.out.println("Click on help center");
	    magic.click_helpcenter();
	    Thread.sleep(2500);
	}

	@Then("User navigate to help center page")
	public void user_navigate_to_help_center_page() throws Exception {
		System.out.println("navigate user to welcome page");
		//Thread.sleep(2000);
		//magic.close_tab();
	    //driver.findElement(By.className("md-close")).click();
	    
	}

	@Given("User is on help center page")
	public void user_is_on_help_center_page() {
		System.out.println("User navigate to help center page");
	    driver.navigate().to("https://www.magicbricks.com/help/");
	    magic.close_tab();
	    //driver.findElement(By.className("md-close")).click();
	}

	@When("Click on search one")
	public void click_on_search_one() throws Exception {
		System.out.println("Click on search one");
	    //driver.findElement(By.id("doSearchButton")).click();
		magic.click_search();
		Thread.sleep(2000);
	}
	
	@When("Click on search two")
	public void click_on_search_two() throws Exception {
		System.out.println("Click on search two");
	    //driver.findElement(By.id("doSearchButton")).click();
		magic.click_search();
		Thread.sleep(2000);
	}
	
	@When("Click on search three")
	public void click_on_search_three() throws Exception {
		System.out.println("Click on search three");
	    //driver.findElement(By.id("doSearchButton")).click();
		magic.click_search();
		Thread.sleep(2000);
	}

	@Then("Alert please Select A Question")
	public void alert_please_Select_A_Question() {
		System.out.println("Alert please Select A Question");
	}

	@When("User enter invalid question")
	public void user_enter_invalid_question() throws Exception {
		System.out.println("user do not enter username and password");
		sh=wb.getSheet("Sheet1");
		magic.enter_question(sh.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(3000);
		
	}

	@Then("Alert You are looking for")
	public void alert_You_are_looking_for() throws Exception {
		System.out.println("Alert You are looking for");
		Thread.sleep(4000);
	}

	@Then("Close")
	public void close() {
		System.out.println("Close");
	    //driver.findElement(By.xpath("//*[@id=\"popup_search_ques\"]/span")).click();
		magic.close_s();
	}
	
	@When("User enter valid question")
	public void user_enter_valid_question() throws Exception {
		System.out.println("User enter valid question");
		sh=wb.getSheet("Sheet1");
		magic.enter_question(sh.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(3000);
	}

	@Then("Suggestion questions will appear")
	public void suggestion_questions_will_appear() throws Exception {
		System.out.println("Suggestion questions will appear");
		Thread.sleep(3000);
	}

	@When("Click on required question")
	public void click_on_required_question() {
		System.out.println("Click on required question");
		magic.click_requiredq();
	}

	@Then("Display the record")
	public void display_the_record() {
		System.out.println("Display the record");
	}

	@When("Click on edit option")
	public void click_on_edit_option() {
		System.out.println("Click on edit option");
		magic.click_edit();
	}

	@When("Click on Owner")
	public void click_on_Owner() {
		System.out.println("Click on Owner");
		magic.c_owner();
	}

	@Then("User is treated as Owner")
	public void user_is_treated_as_Owner() {
		System.out.println("User is treated as Owner");
	}

	@Given("User is on help center page as Owner")
	public void user_is_on_help_center_page_as_Owner() throws Exception {
		System.out.println("User is on help center page as Owner");
	    driver.navigate().to("https://www.magicbricks.com/help/");
	    //magic.close_tab();
		magic.c_owner();
		Thread.sleep(2000);
		
	}

	@When("User click on explore more one")
	public void user_click_on_explore_more_one() {
		System.out.println("User click on explore more one");
		magic.cexplore_more1();
	}
	
	@When("Click on any link under user profile section of owner")
	public void click_on_any_link_under_user_profile_section_of_owner() {
		System.out.println("Click on any link under user profile section of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(1).getCell(6).getStringCellValue();
		if(magic.cnewnlog().getText().equalsIgnoreCase(str))
				{
					magic.c_new_n_log();
					
				}
		else if (magic.cdenre().getText().equalsIgnoreCase(str)) 
		{
			magic.c_de_n_re();;
		}
		else if (magic.cmyprof().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_prof();
		}
		else if (magic.cpasset().getText().equalsIgnoreCase(str)) 
		{
			magic.c_passet();;
		}
		else if (magic.cupdatem().getText().equalsIgnoreCase(str)) 
		{
			magic.c_update_m();
		}
		else if (magic.cupdatemob().getText().equalsIgnoreCase(str)) 
		{
			magic.c_update_mob();
		}
		else if (magic.cmancalnal().getText().equalsIgnoreCase(str)) 
		{
			magic.c_man_cal_n_al();
		}
	}

	@Then("Navigates to next page one")
	public void navigates_to_next_page_one() {
		System.out.println("Navigates to next page one");
	}
	
	@When("Click on any link under page one user profile section of owner")
	public void click_on_any_link_under_page_one_user_profile_section_of_owner() {
		System.out.println("Click on any link under page one user profile section of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(1).getCell(7).getStringCellValue();
		if(magic.cresmypass().getText().equalsIgnoreCase(str))
				{
					magic.c_res_my_pass();
					
				}
		else if (magic.cformypass().getText().equalsIgnoreCase(str)) 
		{
			magic.c_for_my_pass();
		}
		else if (magic.cstrgpass().getText().equalsIgnoreCase(str)) 
		{
			magic.c_strg_pass();
		}
	    
	}

	@Then("Navigates to next page two")
	public void navigates_to_next_page_two() {
		System.out.println("Navigates to next page two");
	    
	}

	@When("Click on any link under page two user profile section of owner")
	public void click_on_any_link_under_page_two_user_profile_section_of_owner() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Navigates to next page three")
	public void navigates_to_next_page_three() {
		//System.out.println("Navigates to next page three");
	    
	}
	
	@When("User click on explore more two")
	public void user_click_on_explore_more_two() {
		System.out.println("User click on explore more two");
		magic.cexplore_more2();
	    
	}

	@When("Click on any link under Property Management of owner")
	public void click_on_any_link_under_Property_Management_of_owner() {
		System.out.println("Click on any link under Property Management of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(2).getCell(6).getStringCellValue();
		if(magic.cfreepropl().getText().equalsIgnoreCase(str))
				{
					magic.c_free_prop_l();
					
				}
		else if (magic.cpostprop().getText().equalsIgnoreCase(str)) 
		{
			magic.c_post_prop();
		}
		else if (magic.ceditpropd().getText().equalsIgnoreCase(str)) 
		{
			magic.c_edit_prop_d();
		}
		else if (magic.clocupd().getText().equalsIgnoreCase(str)) 
		{
			magic.c_loc_up_d();
		}
		else if (magic.cupdedtp().getText().equalsIgnoreCase(str)) 
		{
			magic.c_upd_edt_p();;
		}
		else if (magic.cpropsts().getText().equalsIgnoreCase(str)) 
		{
			magic.c_prop_sts();
		}
		else if (magic.cmagcash().getText().equalsIgnoreCase(str)) 
		{
			magic.c_mag_cash();
		}
		else if (magic.cdereprop().getText().equalsIgnoreCase(str)) 
		{
			magic.c_de_re_prop();
		}
	    
	}
	

	@When("Click on any link under page one user Property Management of owner")
	public void click_on_any_link_under_page_one_user_Property_Management_of_owner() {
		System.out.println("Click on any link under page one user Property Management of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(2).getCell(7).getStringCellValue();
		if(magic.calreadysold().getText().equalsIgnoreCase(str))
				{
					magic.c_already_sold();
					
				}
		else if (magic.cchgmymind().getText().equalsIgnoreCase(str)) 
		{
			magic.c_chg_my_mind();
		}
		else if (magic.cgngoutstat().getText().equalsIgnoreCase(str)) 
		{
			magic.c_gng_out_stat();
		}
		else if (magic.creacprop().getText().equalsIgnoreCase(str)) 
		{
			magic.c_reac_prop();
		}
		else if (magic.cmissms().getText().equalsIgnoreCase(str)) 
		{
			magic.c_mis_sms();
		}
	}

	@When("Click on any link under page two user Property Management of owner")
	public void click_on_any_link_under_page_two_user_Property_Management_of_owner() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under Response Management of owner")
	public void click_on_any_link_under_Response_Management_of_owner() {
		System.out.println("Click on any link under Response Management of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(3).getCell(6).getStringCellValue();
		if(magic.cviewpropb().getText().equalsIgnoreCase(str))
				{
					magic.c_view_prop_b();
					
				}
		else if (magic.cdownpropb().getText().equalsIgnoreCase(str)) 
		{
			magic.c_down_prop_b();
		}
		else if (magic.cprotonl().getText().equalsIgnoreCase(str)) 
		{
			magic.c_prot_onl();
		}
	}

	@When("Click on any link under page one Response Management of owner")
	public void click_on_any_link_under_page_one_Response_Management_of_owner() {
		System.out.println("Click on any link under page one Response Management of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(3).getCell(7).getStringCellValue();
		if(magic.cdresprec().getText().equalsIgnoreCase(str))
				{
					magic.c_d_resp_rec();
					
				}
		else if (magic.cdrespfree().getText().equalsIgnoreCase(str)) 
		{
			magic.c_d_resp_free();
		}
		else if (magic.cdpaidpac().getText().equalsIgnoreCase(str)) 
		{
			magic.c_d_paid_pac();
		}
	}

	@When("Click on any link under page two Response Management of owner")
	public void click_on_any_link_under_page_two_Response_Management_of_owner() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under Orders & Services of owner")
	public void click_on_any_link_under_Orders_Services_of_owner() {
		System.out.println("Click on any link under Orders & Services of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(4).getCell(6).getStringCellValue();
		if(magic.cplbuyad().getText().equalsIgnoreCase(str))
				{
					magic.c_pl_buy_ad();
					
				}
		else if (magic.cpackqur().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pack_qur();
		}
		else if (magic.cpackact().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pack_act();
		}
		else if (magic.cmypacd().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_pac_d();
		}
		else if (magic.cmypacser().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_pac_ser();
		}
	}
	@When("Click on any link under page one Orders & Services section of owner")
	public void click_on_any_link_under_page_one_Orders_Services_section_of_owner() {
		System.out.println("Click on any link under page one Orders & Services section of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(4).getCell(7).getStringCellValue();
		if(magic.cbenf().getText().equalsIgnoreCase(str))
				{
					magic.c_ben_f();
					
				}
		else if (magic.ctypesofpack().getText().equalsIgnoreCase(str)) 
		{
			magic.c_types_ofpack();
		}
		else if (magic.ccontcase().getText().equalsIgnoreCase(str)) 
		{
			magic.c_cont_case();
		}
		else if (magic.cbuyadpack().getText().equalsIgnoreCase(str)) 
		{
			magic.c_buy_ad_pack();
		}
		else if (magic.cvarpay().getText().equalsIgnoreCase(str)) 
		{
			magic.c_var_pay();
		}
		else if (magic.cownnag().getText().equalsIgnoreCase(str)) 
		{
			magic.c_own_n_ag();
		}
		
	}
	
	@When("Click on any link under page two Orders & Services section of owner")
	public void click_on_any_link_under_page_two_Orders_Services_section_of_owner() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under MB Features of owner")
	public void click_on_any_link_under_MB_Features_of_owner() {
		System.out.println("Click on any link under MB Features of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(5).getCell(6).getStringCellValue();
		if(magic.cmypropworth().getText().equalsIgnoreCase(str))
				{
					magic.c_my_prop_worth();
					
				}
		else if (magic.callpropac().getText().equalsIgnoreCase(str)) 
		{
			magic.c_all_prop_ac();
		}
		else if (magic.cforumal().getText().equalsIgnoreCase(str)) 
		{
			magic.c_forum_al();
		}
	    
	}

	@When("Click on any link under page one MB Features section of owner")
	public void click_on_any_link_under_page_one_MB_Features_section_of_owner() {
		System.out.println("Click on any link under page one MB Features section of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(5).getCell(7).getStringCellValue();
		if(magic.cpdiss().getText().equalsIgnoreCase(str))
				{
					magic.c_p_diss();
					
				}
	}

	@When("Click on any link under page two MB Features section of owner")
	public void click_on_any_link_under_page_two_MB_Features_section_of_owner() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under Frequently Asked Questions of owner")
	public void click_on_any_link_under_Frequently_Asked_Questions_of_owner() {
		System.out.println("Click on any link under Frequently Asked Questions of owner");
		//magic.cupdate_email();
		sh=wb.getSheet("owner");
		String str = sh.getRow(6).getCell(6).getStringCellValue();
		if(magic.cdeactacc().getText().equalsIgnoreCase(str))
				{
					magic.c_de_act_acc();
					
				}
		else if (magic.cstorval().getText().equalsIgnoreCase(str)) 
		{
			magic.c_st_or_val();
		}
		else if (magic.cpropvis().getText().equalsIgnoreCase(str)) 
		{
			magic.c_prop_vis();
		}
		else if (magic.callcandopac().getText().equalsIgnoreCase(str)) 
		{
			magic.c_all_can_do_pac();
		}
		else if (magic.crenorref().getText().equalsIgnoreCase(str)) 
		{
			magic.c_ren_or_ref();
		}
		else if (magic.cpacnoact().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pac_no_act();
		}
	}

	@When("Click on Buyer")
	public void click_on_Buyer() {
		System.out.println("Click on Buyer");
		magic.c_buyer();
	}

	@Then("User is treated as Buyer")
	public void user_is_treated_as_Buyer() {
		System.out.println("User is treated as Buyer");
	}

	@Given("User is on help center page as Buyer")
	public void user_is_on_help_center_page_as_Buyer() throws Exception {
		System.out.println("User is on help center page as Buyer");
	    driver.navigate().to("https://www.magicbricks.com/help/");
	    //magic.close_tab();
		magic.c_buyer();
		Thread.sleep(2000);
	}

	@When("User click on explore more three")
	public void user_click_on_explore_more_three() {
		System.out.println("User click on explore more three");
		magic.cexplore_more3();
	}

	@When("Click on any link under user profile section of buyer")
	public void click_on_any_link_under_user_profile_section_of_buyer() {
		System.out.println("Click on any link under user profile section of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(1).getCell(4).getStringCellValue();
		if(magic.crenlog().getText().equalsIgnoreCase(str))
				{
					magic.c_re_n_log();
					
				}
		else if (magic.cmyact().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_act();
		}
		else if (magic.cmypro().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_pro();
		}
		else if (magic.cmyreq().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_req();
		}
		else if (magic.cmyrec().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_rec();
		}
		else if (magic.cprofrononl().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pro_fr_ononl();
		}
		
	}

	@When("Click on any link under page one user profile section of buyer")
	public void click_on_any_link_under_page_one_user_profile_section_of_buyer() {
		System.out.println("Click on any link under page one user profile section of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(1).getCell(5).getStringCellValue();
		if(magic.cprorec().getText().equalsIgnoreCase(str))
				{
					magic.c_pro_rec();
					
				}
		else if (magic.crecmanymail().getText().equalsIgnoreCase(str)) 
		{
			magic.c_rec_many_mail();
		}
	}

	@When("Click on any link under page two user profile section of buyer")
	public void click_on_any_link_under_page_two_user_profile_section_of_buyer() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User click on explore more four")
	public void user_click_on_explore_more_four() {
		System.out.println("User click on explore more four");
		magic.cexplore_more4();
	}

	@When("Click on any link under Search on Magicbricks of buyer")
	public void click_on_any_link_under_Search_on_Magicbricks_of_buyer() {
		System.out.println("Click on any link under Search on Magicbricks of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(2).getCell(4).getStringCellValue();
		if(magic.canynevr().getText().equalsIgnoreCase(str))
				{
					magic.c_any_n_evr();
					
				}
		else if (magic.cabver().getText().equalsIgnoreCase(str)) 
		{
			magic.c_ab_ver();
		}
		else if (magic.crepin().getText().equalsIgnoreCase(str)) 
		{
			magic.c_rep_in();
		}
		else if (magic.ccontadv().getText().equalsIgnoreCase(str)) 
		{
			magic.c_cont_adv();
		}
		else if (magic.chelpbuyprop().getText().equalsIgnoreCase(str)) 
		{
			magic.c_help_buy_prop();
		}
		else if (magic.cprofrononl1().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pro_fr_ononl1();
		}
	}

	@When("Click on any link under page one Search on Magicbricks of buyer")
	public void click_on_any_link_under_page_one_Search_on_Magicbricks_of_buyer() {
		System.out.println("Click on any link under page one Search on Magicbricks of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(2).getCell(5).getStringCellValue();
		if(magic.crepwronginfo().getText().equalsIgnoreCase(str))
				{
					magic.c_rep_wrong_info();
					
				}
		else if (magic.cpronotav().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pro_not_av();
		}
	}

	@When("Click on any link under page two Search on Magicbricks of buyer")
	public void click_on_any_link_under_page_two_Search_on_Magicbricks_of_buyer() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under MB Features of buyer")
	public void click_on_any_link_under_MB_Features_of_buyer() {
		System.out.println("Click on any link under MB Features of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(3).getCell(4).getStringCellValue();
		if(magic.cpropwor().getText().equalsIgnoreCase(str))
				{
					magic.c_prop_wor();
					
				}
		else if (magic.cprauc().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pr_auc();
		}
		else if (magic.ccertag().getText().equalsIgnoreCase(str)) 
		{
			magic.c_cert_ag();
		}
		else if (magic.forall().getText().equalsIgnoreCase(str)) 
		{
			magic.for_all();
		}
	}

	@When("Click on any link under page one MB Features section of buyer")
	public void click_on_any_link_under_page_one_MB_Features_section_of_buyer() {
		System.out.println("Click on any link under page one MB Features section of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(3).getCell(5).getStringCellValue();
		if(magic.cdis().getText().equalsIgnoreCase(str))
				{
					magic.c_dis();
					
				}
	}

	@When("Click on any link under page two MB Features section of buyer")
	public void click_on_any_link_under_page_two_MB_Features_section_of_buyer() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User click on view more one")
	public void user_click_on_view_more_one() {
		System.out.println("User click on view more one");
		magic.c_view_more1();
	}

	@When("Click on any link under Frequently Asked Questions of buyer")
	public void click_on_any_link_under_Frequently_Asked_Questions_of_buyer() {
		System.out.println("Click on any link under Frequently Asked Questions of buyer");
		//magic.cupdate_email();
		sh=wb.getSheet("buyer");
		String str = sh.getRow(4).getCell(4).getStringCellValue();
		if(magic.seronmb().getText().equalsIgnoreCase(str))
				{
					magic.ser_o_nmb();
					
				}
		else if (magic.cunsub().getText().equalsIgnoreCase(str)) 
		{
			magic.c_un_sub();
		}
		else if (magic.ckonwsts().getText().equalsIgnoreCase(str)) 
		{
			magic.c_konw_sts();
		}
		else if (magic.cchgusrty().getText().equalsIgnoreCase(str)) 
		{
			magic.c_chg_usr_ty();
		}
		else if (magic.cnotp().getText().equalsIgnoreCase(str)) 
		{
			magic.c_n_otp();
		}
		else if (magic.cbrokchr().getText().equalsIgnoreCase(str)) 
		{
			magic.c_brok_chr();
		}
		else if (magic.cedtcon().getText().equalsIgnoreCase(str)) 
		{
			magic.c_edt_con();
		}
	}

	@When("Click on Agent")
	public void click_on_Agent() {
		System.out.println("Click on Agent");
		magic.c_agent();
	}

	@Then("User is treated as Agent")
	public void user_is_treated_as_Agent() {
		System.out.println("User is treated as Agent");
	}

	@Given("User is on help center page as Agent")
	public void user_is_on_help_center_page_as_Agent() throws Exception {
		System.out.println("User is on help center page as Buyer");
	    driver.navigate().to("https://www.magicbricks.com/help/");
	    //magic.close_tab();
		magic.c_agent();
		Thread.sleep(2000);
		
	}

	@When("User click on explore more five")
	public void user_click_on_explore_more_five() {
		System.out.println("User click on explore more five");
		magic.cexplore_more5();
	}

	@When("Click on any link under user profile section of Agent")
	public void click_on_any_link_under_user_profile_section_of_Agent() {
		System.out.println("Click on any link under user profile section of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(1).getCell(6).getStringCellValue();
		if(magic.cnregnlogin().getText().equalsIgnoreCase(str))
				{
					magic.c_nu_reg_nlogin();
					
				}
		else if (magic.cemyp().getText().equalsIgnoreCase(str)) 
		{
			magic.c_emyp();
		}
		else if (magic.caccde().getText().equalsIgnoreCase(str)) 
		{
			magic.c_acc_de();
		}
		else if (magic.cchgmymob().getText().equalsIgnoreCase(str)) 
		{
			magic.c_chg_my_mob();
		}
		else if (magic.cagsc().getText().equalsIgnoreCase(str)) 
		{
			magic.c_ag_sc();
		}
		else if (magic.cresmypas().getText().equalsIgnoreCase(str)) 
		{
			magic.c_res_my_pas();
		}
		else if (magic.cchgmyem().getText().equalsIgnoreCase(str)) 
		{
			magic.c_chg_my_em();
		}


	}

	@When("Click on any link under page one user profile section of Agent")
	public void click_on_any_link_under_page_one_user_profile_section_of_Agent() {
		System.out.println("Click on any link under page one user profile section of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(1).getCell(7).getStringCellValue();
		if(magic.cmym().getText().equalsIgnoreCase(str))
				{
					magic.c_my_m();
					
				}
		else if (magic.cwithoutm().getText().equalsIgnoreCase(str)) 
		{
			magic.c_without_m();
		}
		else if (magic.calmail().getText().equalsIgnoreCase(str)) 
		{
			magic.c_al_mail();
		}
	}

	@When("Click on any link under page two user profile section of Agent")
	public void click_on_any_link_under_page_two_user_profile_section_of_Agent() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under Property Management of Agent")
	public void click_on_any_link_under_Property_Management_of_Agent() {
		System.out.println("Click on any link under Property Management of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(2).getCell(6).getStringCellValue();
		if(magic.cpostmyprop().getText().equalsIgnoreCase(str))
				{
					magic.c_post_my_prop();
					
				}
		else if (magic.caddloca().getText().equalsIgnoreCase(str)) 
		{
			magic.c_add_loca();
		}
		else if (magic.crefprop().getText().equalsIgnoreCase(str)) 
		{
			magic.c_ref_prop();
		}
		else if (magic.cdelpro().getText().equalsIgnoreCase(str)) 
		{
			magic.c_del_pro();
		}
		else if (magic.cofraud().getText().equalsIgnoreCase(str)) 
		{
			magic.c_o_fraud();
		}
	}

	@When("Click on any link under page one user Property Management of Agent")
	public void click_on_any_link_under_page_one_user_Property_Management_of_Agent() {
		System.out.println("Click on any link under page one user Property Management of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(2).getCell(7).getStringCellValue();
		if(magic.cqrfra().getText().equalsIgnoreCase(str))
				{
					magic.c_qr_fra();
					
				}
	}

	@When("Click on any link under page two user Property Management of Agent")
	public void click_on_any_link_under_page_two_user_Property_Management_of_Agent() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under Response Management of Agent")
	public void click_on_any_link_under_Response_Management_of_Agent() {
		System.out.println("Click on any link under Response Management of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(3).getCell(6).getStringCellValue();
		if(magic.cvmyres().getText().equalsIgnoreCase(str))
				{
					magic.c_v_my_res();
					
				}
		else if (magic.cdowres().getText().equalsIgnoreCase(str)) 
		{
			magic.c_dow_res();
		}
		else if (magic.clmtview().getText().equalsIgnoreCase(str)) 
		{
			magic.c_lmt_view();
		}
	}

	@When("Click on any link under page one Response Management of Agent")
	public void click_on_any_link_under_page_one_Response_Management_of_Agent() {
		System.out.println("Click on any link under page one Response Management of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(3).getCell(7).getStringCellValue();
		if(magic.cdowdet().getText().equalsIgnoreCase(str))
				{
					magic.c_dow_det();
					
				}
		else if (magic.crescan().getText().equalsIgnoreCase(str)) 
		{
			magic.c_res_can();
		}
	}

	@When("Click on any link under page two Response Management of Agent")
	public void click_on_any_link_under_page_two_Response_Management_of_Agent() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("Click on any link under Orders & Services of Agent")
	public void click_on_any_link_under_Orders_Services_of_Agent() {
		System.out.println("Click on any link under Orders & Services of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(4).getCell(6).getStringCellValue();
		if(magic.cmansub().getText().equalsIgnoreCase(str))
				{
					magic.c_man_sub();
					
				}
		else if (magic.cbuyapac().getText().equalsIgnoreCase(str)) 
		{
			magic.c_buy_a_pac();
		}
		else if (magic.cqonag().getText().equalsIgnoreCase(str)) 
		{
			magic.c_q_on_ag();
		}
		else if (magic.cvosts().getText().equalsIgnoreCase(str)) 
		{
			magic.c_del_pro();
		}
		else if (magic.clookac().getText().equalsIgnoreCase(str)) 
		{
			magic.c_look_ac();
		}
	}
	

	@When("Click on any link under page one Orders & Services section of Agent")
	public void click_on_any_link_under_page_one_Orders_Services_section_of_Agent() {
		System.out.println("Click on any link under page one Orders & Services section of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(4).getCell(7).getStringCellValue();
		if(magic.cpacac().getText().equalsIgnoreCase(str))
				{
					magic.c_pac_ac();
					
				}
		else if (magic.ccheque().getText().equalsIgnoreCase(str)) 
		{
			magic.c_cheque();
		}
		else if (magic.cpstillno().getText().equalsIgnoreCase(str)) 
		{
			magic.c_p_still_no();
		}
	}

	@When("Click on any link under page two Orders & Services section of Agent")
	public void click_on_any_link_under_page_two_Orders_Services_section_of_Agent() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Click on any link under MB Features of Agent")
	public void click_on_any_link_under_MB_Features_of_Agent() {
		System.out.println("Click on any link under MB Features of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(5).getCell(6).getStringCellValue();
		if(magic.cpw().getText().equalsIgnoreCase(str))
				{
					magic.c_p_w();
					
				}
		else if (magic.cpauct().getText().equalsIgnoreCase(str)) 
		{
			magic.c_p_auct();
		}
		else if (magic.cfalauc().getText().equalsIgnoreCase(str)) 
		{
			magic.c_f_al_auc();
		}
	}
	

	@When("Click on any link under page one MB Features section of Agent")
	public void click_on_any_link_under_page_one_MB_Features_section_of_Agent() {
		System.out.println("Click on any link under page one MB Features section of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(5).getCell(7).getStringCellValue();
		if(magic.cpadis().getText().equalsIgnoreCase(str))
				{
					magic.c_pa_dis();
					
				}
	}

	@When("Click on any link under page two MB Features section of Agent")
	public void click_on_any_link_under_page_two_MB_Features_section_of_Agent() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("User click on view more two")
	public void user_click_on_view_more_two() {
		System.out.println("User click on view more two");
		magic.c_view_more2();
	}

	@When("Click on any link under Frequently Asked Questions of Agent")
	public void click_on_any_link_under_Frequently_Asked_Questions_of_Agent() {
		System.out.println("Click on any link under Frequently Asked Questions of Agent");
		//magic.cupdate_email();
		sh=wb.getSheet("agent");
		String str = sh.getRow(6).getCell(6).getStringCellValue();
		if(magic.ctyofpac().getText().equalsIgnoreCase(str))
				{
					magic.c_p_w();
					
				}
		else if (magic.ctyofpac().getText().equalsIgnoreCase(str)) 
		{
			magic.c_ty_of_pac();
		}
		else if (magic.csamemob().getText().equalsIgnoreCase(str)) 
		{
			magic.c_same_mob();
		}
		else if (magic.cdeacc().getText().equalsIgnoreCase(str)) 
		{
			magic.c_de_acc();
		}
		else if (magic.cpacnotact().getText().equalsIgnoreCase(str)) 
		{
			magic.c_pac_not_act();
		}
		else if (magic.cstsval().getText().equalsIgnoreCase(str)) 
		{
			magic.c_sts_val();
		}
		else if (magic.cmyprlive().getText().equalsIgnoreCase(str)) 
		{
			magic.c_my_pr_live();
		}
		else if (magic.csver().getText().equalsIgnoreCase(str)) 
		{
			magic.c_s_ver();
		}
		else if (magic.cnoeres().getText().equalsIgnoreCase(str)) 
		{
			magic.c_no_e_res();
		}
		else if (magic.cvsubuser().getText().equalsIgnoreCase(str)) 
		{
			magic.c_v_sub_user();
		}
		else if (magic.cchgusr().getText().equalsIgnoreCase(str)) 
		{
			magic.c_chg_usr();
		}
	}
}