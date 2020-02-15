import java.io.*;
class Hospital_Website
{
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static int choice, star, regis, askchoice ,hoschoice, choice2, code, enter,we=0,mnth, date, yr, count =0,cho,yr1,mnth1,date1,hour1,min1,i1 = 0,n,r,p,price , amount, total,choic2,choice3,k=0,choice4,i2=0,discount,f2=0,u8=0;
    static String user,pass,nm,docnm2,frsnm, lsnm, usrnm, psswr, psswr2, phone,cit, postal, adres, cho1, loca, frsnm1,lsnm1,phone1,namemed,conti,fdbk;
    static String prefeed[] = new String[]{"Micheal", "John", "Kavitha", "Pritviraj", "Justin", "Kelly", "Josh", "Toby", "Simon", "Alicia"};
    static int rate[] = new int[]{3,5,4,3,4,3,5,4,3,3};
    static String feed[] = new String[]{"I really liked the hospital but it could have been cleaner","I was suprised that there was such a good hospital in my town","I as a old women felt that the staff took care of me vey well","I was impressed how big this hospital was", "It was a very nice experience","I felt the facilities were very convenient","I really liked the fact that we did not have to wait for a long time","The cheapness of the medicines apppealed to me","The heart surgery i had was not so expensive and wavery effective","I love this hospital because they completely got rid of the diabetes i had"};
    static String city[] = new String[]{"Chennai","Bengaluru","Hyderabad","Thiruvananthapuram","Kolkata","Pune"};
    static String hosnm[]= new String[]{"Velachery","Anna nagar","Jayangar","Koramangala","Gachibowli","Madhapur"};
    static String hosnm2[] = new String[]{"Palayam","Venpalavattom","Gariahat","Dhakuria","Kharadi","Kondhwa"};
    static String phno[] = new String[]{"0442 123 520","021 4567 652","080 3080 4444","080 2563 3833","040 6700 0000","040 4540 4540"};
    static String phno2[] = new String[]{"1860 500 7788","0471 304 5111","0983 109 6761","033 6626 0000","020 7129 0222","020 6684 6244"};
    static String strnm[] = new String[]{"Karalu Street, KK nagar","Modai Street, 12th Main Road","21/2 (Old No.2), 14th Cross, 3rd Block","Plot No.51, Opp Jyoti Nivas College, Jyoti Nivas College Road","Plot No. 3, Road No. 2, IT & Financial District, Nanakramguda","Behind Cyber Towers, Lane Next To McDonalds, Hitech City"}; 
    static String strnm2[] = new String[]{"Pattoor PMG Rd","Chackai, Anayara P O","111A, Rash Behari Avenue, Near Mahanirvan Math","No.P-4&5, C.I.T Scheme, Block-A, Gariahat Road","No.2A, Near Nyati Empire, 22, Old, Mundhwa - Kharadi Rd","Opposite Fakhri Hills, Kondhwa Rd"};
    static String plnm[] = new String[]{"Chennai","Chennai","Bengaluru","Bengaluru","Hyderabad","Hyderabad"};
    static String plnm2[] = new String[]{"Thiruvananthapuram","Thiruvananthapuram","Kolkata","Kolkata","Pune","Pune"};
    static String postco[] = new String[]{"600042","600040","560025","560001","500002","500013"};
    static String postco2[] = new String[]{"695001","690025","700029","700021","411014","411002"};
    static String docnm[] = new String[]{"K.S. Nandhakishore","S. Shanthi","D. Krishnamurthy","S.Laxmi","Shankar Subramanian","Subash Chandran","Sriram Ambani","Aadil Sinju","Aabid Sial", "Vishwajit Venkatesh","Naarayana Kumar","Manish Kumar","Hussain Surti","Sharath Shankar","Amit Jayakar","Abdul Billa","Kushaal Mehta","Vikram Bareto","Sriram Kumar","Aditya Karthik","Aamir Sinju","Emmanual Rishabh","Thejus Simon","Dwani Bohra","Adhya Bohpanna","Arundathi David","Sailesh Kumar","Tamim Azmain","Samin Hoque","Soumyadip Nandi","Aayush Ramma","Srinithi Somavalli","Adhiveerapandian","Charan Sohal","Zhea Martinent","Dhruv Ramachadran"};
    static String sepcia[] = new String[]{"Gynecologist","Allergist","Dermatologist","Cardiologist","Neurologist","Physiatrist","Oncologist","Anesthesiologist","Psychologist","Dentist","Dermatologist","Endocrinlogist","Epidemiologist","Physiatrist","Oncologist","Anesthesiologist","Psychologist","Dentist","Caridiologist","Gynecologist","Dermatologist","Cardiologist","Neurologist","Physiatrist","Oncologist","Anesthesiologist","Psychologist","Dentist","Immunologist","Microbiologist","Oncologist","Anesthesiologist","Psychologist","Dentist","Dermatologist","Endocrinlogist"};
    static String availa = "MON-SAT: 9:00-12:30 and 1:00-7:00";
    static String hosnm3[]=new String[]{"Velachery","Velachery","Velachery","Anna nagar","Anna nagar","Anna nagar","Jayangar","Jayangar","Jayangar","Koramangala","Koramangala","Koramangala","Gachibowli","Gachibowli","Gachibowli","Madhapur","Madhapur","Madhapur","Palayam","Palayam","Palayam","Venpalavattom","Venpalavattom","Venpalavattom","Gariahat","Gariahat","Gariahat","Dhakuria","Dhakuria","Dhakuria","Kharadi","Kharadi","Kharadi","Kondhwa","Kondhwa","Kondhwa"};
    static String disea []= {"Bleeding","Fracture","Eye","Unconsciousness","Heart Attack","Burns","Swalloing Poison","Snake bite","Stinging"};
    static String bleed []= {"Firstly, raise the affected part to minimize gravitational outflow of blood.","Wash the cut surface with clean water.","Press the area with a pieace of clean cooton wool.","If possible add some mild antiseptic"};
    static String frac []= {"Firstly, lay the victim comfortably and looson the clothes from the affected part.","Do not move the fractured parts.","If the fractured part is an arm. tie a sling to rest the arm in it."};
    static String eye []= {"If anything falls in your eye, make sure that you dont rub it.","Wash gently with clean water by sprinkling it into the eye" };
    static String uncons []= {"First, immediately lay the person comfortably on the bed.","Looson the clothes.","Let fresh air to come in"};
    static String heart []= {"Immediately lay the person straight horizontally and allow fresh air to come in"};
    static String burn []= {"First, immediately wash the with sufficiently cold water for few minutes","Do not rub the part","Apply creams/ointments"};
    static String posion []= {"Firstly, make the person drink as much as salt water possible","Try to induce vomiting (even forcibly"};   
    static String snake []= {"Immediately squeeze out some blood from the wound","Tie a tourniquet above the site to prevent spreading of venom into the body"};
    static String sting []= {"Firstly, pull out the sting if still in the wound","Squeeze out some blood to force out the venom","Apply some alkali like baking soda or lime"};
    static String medicine[] = {"First aid","Oinments","Fever tablets","Head and Stomach ache Medicines"};
    static String firstai[] = {"Bandages (one box = Rs.30)","Antiseptic creams (Rs.75)","Insect Sprays (Rs.60)","Thermometer (Rs 50)","alcohol-free cleansing wipes (One bos = 20 wipes = Rs.50)","Guaze roll (Rs.100)","Eye shield (eye pad) (Rs. 40)","Elastic Bandages (Rs.60)","Hand sanitizer (Rs.40)","Gemini First Aid Kit (Rs.500)"};
    static String namemed1[] = new String[100];
    static int rec[]=new int[100];
    static int amount1[]=new int [100];
    static String kit[]={"Bandages","Antiseptic Cream","Insect Spray","First aid manual","Hand Sanitizer","Thermometer","alcohol-free cleansing wipes","Guaze rolls","Eye shield","Elastic bandages","Instant cold pack","List of emergency numbers","Blanket","Emergency food"};
    static double tax = 0, totalpayment=0;
    static String ointm[] = {"Moov Ointment (Rs.100)","Tiger Balm (Rs.110)","Sallaki Oil (Rs.130)","Vollini (Rs150)","Healing Ointment (Rs.100)"};
    static String tablets[] = {"Mild Fever tablets (Rs.50)","Cough drops (Rs.30)","Strong Fever tablets (Rs.60)","Ayurvedic Fever Tablet (Rs.40)"};
    static String heads[] = {"Aspirin (Pain reliever) (Rs.120)","Head ache tablets (Rs.30)","Stomach ache tablets (Rs.30)","Head massage oil (Rs.40)"};
    static String heapro[]= {"if you have a Cold","for Hand pain","for Leg pain","for Shoulder pain","if you have Diabetes","if you have high blood pressure" };
    static String diabetes[] ={"Bitter Guard.Bitter gourd, also known as bitter melon, can be helpful for controlling diabetes due to its blood glucose lowering effects. It tends to influence the glucose metabolism all over your body rather than a particular organ or tissue.","Cinnamon.Powdered cinnamon has the ability to lower blood sugar levels by stimulating insulin activity. It contains bioactive components that can help prevent and fight diabetes.","Fenugreek.Fenugreek is an herb that can also be used to control diabetes, improve glucose tolerance and lower blood sugar levels due to its hypoglycaemic activity. It also stimulates the secretion of glucose-dependent insulin.","Amla.Indian gooseberry, also known as Amla, is rich in vitamin C and Indian gooseberry juice promotes proper functioning of your pancreas.","Indian Black Berry.Black plum or jambul, also known as jamun can help a lot in controlling blood sugar level because it contains anthocyanins, ellagic acid, hydrolysable tannins etc.","Mango leaves.The delicate and tender mango leaves can be used to treat diabetes by regulating insulin levels in the blood. They can also help improve blood lipid profiles.","Curry Leaves.Curry leaves are useful in preventing and controlling diabetes as they have anti-diabetic properties. It is believed that curry leaves contain an ingredient that reduces the rate at which starch is broken down to glucose in diabetics.","Alovera.Aloe vera gel helps lower fasting blood glucose levels. It contains phytosterols that have possible anti-hyperglycemic effects for type 2 diabetes"};
    static String bp[] ={"Basil.Extract of basil has been shown to lower blood pressure, although only briefly. Adding fresh basil to your diet is easy and certainly can’t hurt.","Cinnamon.Cinnamon is another tasty seasoning that requires little effort to include in your daily diet, and it may bring your blood pressure numbers down. Consuming cinnamon every day has been shown to lower blood pressure in people with diabetes.","Cardamom. A study investigating the health effects of cardamom found that participants given powdered cardamom daily for several months saw significant reductions in their blood pressure readings. ","Flaxseed.Flaxseed is rich in omega-3 fatty acids, which have been found to lower blood pressure significantly","Garlic.Garlic has the ability to lower your blood pressure by causing your blood vessels to relax and dilate. This lets blood flow more freely and reduces blood pressure.","Ginger.Ginger may help control blood pressure, as it has been shown to improve blood circulation and relax the muscles surrounding blood vessels.","Hawthron.Hawthorn is an herbal remedy for high blood pressure that has been used in traditional Chinese medicines for thousands of years. ","Celery Seed.Celery has been long used to treat hypertension in China, but studies also show that it may be effective. You can use the seeds to lower blood pressure, but you can also juice the whole plant." };
    static String shoulder[] = {"Cold Compress.Cold compresses are highly beneficial in alleviating shoulder pain. The cold temperature helps numb the area, which in turn reduces inflammation and pain.","Hot compress.Just like cold compresses, hot compresses also help treat shoulder pain, inflammation and swelling. It is best to use hot compresses after 48 hours of the injury occurring. Hot compresses also help relieve the pain of stressed out muscles.","Compression.Compression means putting even pressure on the painful area to help reduce the swelling. A compression wrap will give ample support to your shoulder and make you feel more comfortable.","Epsom Salt Bath.Epsom salt, made up of magnesium sulfate, can help reduce shoulder pain. It helps improve blood circulation and relax stressed shoulder muscles. It also helps relieve stress from the entire body.","Massage.Massage is another good way to reduce shoulder pain. A gentle massage will help your shoulder muscles release stress and tension. In addition, it will improve blood circulation and reduce swelling and stiffness.","Turmeric.Turmeric is a good remedy to relieve pain in your shoulder. The curcumin in turmeric contains antioxidant as well as anti-inflammatory properties that help reduce pain and swelling.","Lavender oil.Lavender oil is an excellent essential oil that can relax tired muscles. This aids in reducing pain as well as inflammation.","Alfalfa.Alfalfa is another herbal remedy that can relieve pain and swelling. It ensures smooth blood flow throughout the body, in turn reducing inflammation and swelling."};
    static String leg[] ={"Cold Compresses.When leg pain occurs after strenuous physical activity, you can simply apply cold compresses. This will help reduce the pain by numbing the affected area and control swelling and inflammation.","Maasage.Massage promotes faster recovery from muscle damage that causes leg pain.","Turmeric.Another effective home remedy for leg pain is turmeric, which has antioxidant as well as anti-inflammatory properties.","Tart Cherry Juice.If strenuous physical activity is the cause of your leg pain or muscle soreness, drink tart cherry juice. The antioxidant and anti-inflammatory properties of tart cherries help prevent and treat soft tissue injury and pain.","Espom Salt Soak.Epsom salt contains magnesium, an important electrolyte that helps regulate nerve signals in the body. It even works as a natural muscle relaxant and helps reduce pain, inflammation and swelling.","Apple Cider Vineger.Apple cider vinegar can also help reduce pain in your leg(s). It is particularly beneficial for arthritis and gout pain. Its alkalizing effect helps dissolve uric acid crystals in the blood."};
    static String hand[]={"Cold pack.Cold therapy is good for those suffering from hand arthritis. You can use ice packs, a plastic bag filled with crushed ice or a bag of frozen vegetables.","Apple Cider Vinegar. Apple cider vinegar has anti-inflammatory and alkaline-forming properties that help reduce pain and stiffness in the hands from arthritis.","Ginger.Ginger contains antioxidant and anti-inflammatory properties that help reduce arthritis pain and inflammation. You can add this herb in your foods and also drink ginger tea to derive its benefits.","Honey and Cinnamon.The combination of honey and cinnamon powder is a good natural way to treat arthritis in hands and help relax stiff muscles due to their excellent healing properties.","Epsom salt.Epsom salt is good for reducing the stiffness, inflammation and pain associated with arthritis. It is a rich source of magnesium which is important for bone mineralization; most arthritis patients have demineralized bones.","Olive oil.There is a strong connection between olive oil and inflammation caused by arthritis. A special compound known as oleocanthal present in olive oil helps prevent the production of pro-inflammatory COX-1 and COX-2 enzymes."};
    static String cold[]= {"Stay Hydrated","Rest. Your body needs to heal.","Soothe a sore throat. Gurgle with a mixture of hotwater and a teaspoon of salt","Over-the-counter saline nasal drops and sprays can help relieve stuffiness and congestion.","Sip warm liquids.","Add moisture to the air.  A cool mist vaporizer or humidifier can add moisture to your home, which might help loosen congestion."};

    public static void main ()throws IOException
    {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("                                                        <>");
        System.out.println("             Welcome to Gemini Hospital!                <>");
        System.out.println("                                                        <>");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");        
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 1 to know more About us                           <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 2 for Medical Appointemnt Booking                 <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 3 for Online Consultation                         <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 4 to Contact Us                                   <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 5 to give Feedback                                <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 6 to view Feebcak from Previous Patients          <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 7 to Sign up                                      <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 8 for Gemini Pharmacy                             <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("Press 0 to exit                                         <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("                                                        <>");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("                                                        <>");
        System.out.println("Emergency - Call 110!                                   <>");
        System.out.println("                                                        <>");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println();
        choice =Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(choice)
        {
            case 0: System.exit(0);
            break;
            case 1: about();
            break;
            case 2: appoint();
            break;
            case 3: ask();
            break;
            case 4: contact();
            break;            
            case 5: feedbk();
            break;
            case 6: prefdbk();
            break;
            case 7: sgnup();
            break;
            case 8: retail();
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            main();
        }
    }

    public static void about()throws IOException
    {
        System.out.println("Enter 1 to know about our History");
        System.out.println("");
        System.out.println("Enter 2 to know about our latest technologies");
        System.out.println("");
        System.out.println("Enter 3 to view all of our achievements");
        System.out.println("");
        askchoice = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(askchoice)
        {
            case 1:System.out.println("Gemini Hospitals was inaugurated in 1983 by Shri Giani Zail Singh (President of India). ");
            System.out.println("The first Gemini Hospital was in Chennai. The hospital commenced commercial operations the next year.");
            System.out.println("");
            System.out.println("1983 - First Cardiac Surgery (Atrial septal Defect) and First Gemini Health check.");
            System.out.println("1984 - First kidney transplantation at Gemini Chennai First Coronary Artery Bypass Graft Surgery.");
            System.out.println("");
            System.out.println("1988 - Introduced Coronary Artery Stenting for the Ist time in India.");
            System.out.println("1988 - First pharmacy retail outlet in Chennai.");
            System.out.println("1989 - IVF Unit creates medical history with the birth of a baby by 'GIFT' procedure.");
            System.out.println("1990 - Revolutionary orthopedic surgery - equalizing of limbs and deformity correction by llizarov procedure.");
            System.out.println("");
            System.out.println("The 90's also saw Apollo Hospitals rapidly scaling up its operations and infrastructure.");
            System.out.println("");
            System.out.println("1991 - First international patient - from Middle East.");
            System.out.println("In 1993, Gemini hospitals launched the 24 hour ambulance service.");
            System.out.println("1994 - Teletherapy Unit and India's first Dose Rate Micro Selectron installed at Apollo Specialty Hospital.");
            System.out.println("1994 - Cardiac Surgery Programme completes 10,000 surgeries.");
            System.out.println("In 1995, the Apollo Speciality Hospital, a state-of-the-art cancer hospital in Chennai was inaugurated.");
            System.out.println("1995 - First bone marrow transplant.");
            System.out.println("1995 - First multi organ transplant in the country at Gemini Hospitals, Chennai.");
            System.out.println("1995 - First Stereotactic radiosurgery unit in South Asia.");
            System.out.println("");
            System.out.println("2001 - Gemini Specialty Hospital, Chennai completes 100 Bone Marrow Transplants.");
            System.out.println("Gemini Hospitals was recognized as a 'Superbrand of India' in the healthcare sector for 2003 and 2004.");
            System.out.println("2004 - Gemini Hospitals, Hyderabad - First in the world to use satellite technology for telemedicine.");
            System.out.println("2005 - First 3 Tesla MRI in India in New Delhi.");
            System.out.println("");
            System.out.println("World's 1st iPod Navigation Hip Resurfacing Surgery was successfully performed at Gemini Speciality Hospitals, Chennai.");
            System.out.println("Indraprastha Gemini Hospitals, Delhi also completed over 500 liver transplants in February, 2011.");
            System.out.println("2011 - Gemini Health City - Hyderabad recognised as Best Medical Tourism Facility for 2009-2010 by GOI.");
            System.out.println("2011 - India's first Robotic Bariatric program launched at Gemini Hospitals, Chennai in 2011.");
            System.out.println("2012 - First of its Kind-Dental Wellness Centre in India, the White, Luxury dental spa launched.");
            System.out.println("2012 - Gemini Hospitals, Hyderabad performs first coronary angioplasty in India using fully absorbable stent.");
            System.out.println("");
            System.out.println("");
            break;
            case 2:System.out.println("Indraprastha Gemini Hospitals, Delhi first to install the PET-MR Suite in South Asia");
            System.out.println("");
            System.out.println("First hospital group to bring the 320 Slice CT- Angio scan system and the 64 Slice CT-Angio scan system to India");
            System.out.println("");
            System.out.println("First hospital group in South-East Asia to introduce the 16 Slice PET-CT Scan");
            System.out.println("");
            System.out.println("");
            System.out.println("Equipped with the largest and most sophisticated sleep laboratory in the world");
            System.out.println("");
            System.out.println("Novalis Tx™ Radiotherapy and Radiosurgery, was launched at Gemini Cancer Institute Hyderabad");
            System.out.println("");
            System.out.println("Introduced the most advanced CyberKnife® Robotic Radio Surgery System in Asia Pacific, the world's first and only");
            System.out.println("robotic radiosurgery system designed to treat tumors anywhere in the body with sub-millimeter accuracy");
            System.out.println("");
            System.out.println("Indraprastha Gemini Hospitals Delhi is now equipped with bioMerieux's MALDI-TOF-VITEK ® MS system -");
            System.out.println("a rapidly automated microbial identification system that identifies disease-causing microorganisms such as bacteria and fungi");
            System.out.println("");
            System.out.println("Indraprastha Gemini Hospitals New Delhi installed the Echosens Fibroscan for conducting non-invasive liver scan.");
            System.out.println("This would augment the facility for early pick up and diagnosis of Cirrhosis.");
            System.out.println("");
            System.out.println("");
            System.out.println("a shorter hospital stay, faster return to normal daily activities and better clinical outcomes");
            System.out.println("");
            System.out.println("The Renaissance™ Robotic Surgical System transforms spine surgery from freehand procedures to highly-accurate, ");
            System.out.println("state-of-the-art robotic procedures, while ensuring excellent outcomes");
            System.out.println("");
            System.out.println("MRI guided HIFU is an innovative mode for genuinely non-invasive treatment of fibroids.");
            System.out.println("Under MRI guidance, sound waves are passed into the body and focused into the fibroid to heat and coagulate the tissues.");
            System.out.println("");
            System.out.println("");
            break;
            case 3:System.out.println("Gemini Hospitals, Chennai completes the highest number of Combined Heart and Double Lung Transplants in India.");
            System.out.println("");
            System.out.println("Gemini Hospitals, Chennai successfully performed a combined heart and lung transplant on the oldest recorded recipient in India.");
            System.out.println("");
            System.out.println("Gemini Hospitals, Chennai successfully performed the first simultaneous Liver-Intestine-Pancreas transplant in India.");
            System.out.println("");
            System.out.println("Largest series of aortic valve replacement with stentless heart valve bioprosthesis performed.");
            System.out.println("");
            System.out.println("Gemini Bramwell Hospital Mauritius in conjunction with Global Biohealth Solutions, launched the Gemini Bramwell Stem Cell Therapy Program.");
            System.out.println("");
            System.out.println("World's 1st iPod Navigation Hip Resurfacing Surgery was successfully performed at Gemini Speciality Hospitals, Chennai.");
            System.out.println("");
            System.out.println("Gemini performed an unprecedented revolution in orthopedics by equalizing limbs and deformity correction by the llizarov procedure.");
            System.out.println("");
            System.out.println("Gemini Gleneagles Cancer Hospital launched Eastern India's first dedicated comprehensive Bone Marrow Transplant Unit.");
            System.out.println("");
            System.out.println("Thoraco Omphalopagus conjoined female twins from Tanzania were successfully separated at Gemini Children's Hospital.");
            System.out.println("");
            System.out.println("Gemini Hospitals, Chennai successfully performed a Robotic surgery for Cancer base of the tongue, a first of its kind in Tamil Nadu.");
            System.out.println("");
            System.out.println("Gemini Hospitals, Hyderabad successfully treats a critically ill eleven day old baby with a complex and rare cardiac surgery - a first of its kind in India");
            System.out.println("");
            System.out.println("");
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            about();
        }
        System.out.println("If you want to go back to the Main Menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }                
    }

    static String cities [] = {"Chennai","Bengaluru","Hyderabad","Thiruvananthapuram","Kolkata","Pune"};
    public static void appoint() throws IOException
    {
        System.out.println("                Medical Appointment Boooking");
        System.out.println();
        System.out.println("Enter 1 to locate a doctor");
        System.out.println("");
        System.out.println("Enter 2 to locate hospital");
        hoschoice = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(hoschoice)
        {
            case 1:System.out.println("Enter 1 to search with a list of Doctor names");
            System.out.println("");
            System.out.println("Enter 2 to search by Doctor name");
            System.out.println("");
            choice2 = Integer.parseInt(br.readLine());
            System.out.println("\f");
            switch(choice2)
            {
                case 1:System.out.println("Now, enter your city");
                System.out.println();
                for(int i=0;i<6;i++)
                {
                    System.out.println("Enter "+i+" for "+cities[i]);
                    System.out.println();
                }
                int choi = Integer.parseInt(br.readLine());
                System.out.println("\f");
                switch(choi)
                {
                    case 0:for(int i=0;i<3;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    for(int i=3;i<6;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    break;
                    case 1:for(int i=6;i<9;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    for(int i=9;i<12;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }  
                    break;
                    case 2:for(int i=12;i<15;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    for(int i=15;i<18;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }  
                    break;
                    case 3:for(int i=18;i<21;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    for(int i=21;i<24;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }  
                    break;
                    case 4:for(int i=24;i<27;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    for(int i=27;i<30;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }  
                    break;
                    case 5:for(int i=30;i<33;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                    for(int i=33;i<36;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }  
                    break;
                    default :System.out.println("\f");
                    System.out.println("Number inputted is either not in the option or spelling is wrong");
                    System.out.println("\f");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                case 2:System.out.println("Enter the Docotor's name whom you would like to have an appointment with");
                System.out.println("");
                System.out.println("(* Do not add 'Dr.')");
                docnm2 =br.readLine();
                System.out.println("\f");
                for(int i=0;i<36;i++)
                {
                    if(docnm2.equalsIgnoreCase(docnm[i]))
                    {
                        System.out.println("Is this the Doctor whom you would like to have an apppointment with?");
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Hospital name: " + hosnm3[i]+ " Gemini Hospital");
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                        System.out.println("If no, enter 1 (You can try again!!)");
                        System.out.println("");
                        System.out.println("If yes enter 2");
                        int no=Integer.parseInt(br.readLine());
                        if(no==1)
                        {
                            System.out.println("\f");
                            appoint();
                        }
                        else
                        {
                            System.out.println("Enter the code of the doctor you chose");
                            code = Integer.parseInt(br.readLine());
                            System.out.println("\f");
                            finalregis();
                        }
                    }
                }   
                System.out.println("We have no Docotors with the name that you have given us");
                System.out.println("");
                System.out.println("Please check if you have spelled the name properly");
                System.out.println("");
                System.out.println("(* There is always a space between the first and last name)");
                System.out.println("");
                System.out.println("Press 1 to try again"); 
                int pres5 = Integer.parseInt(br.readLine());
                if(pres5 == 1)
                {                        
                    System.out.println("\f");
                    appoint();
                } 
                else
                {
                    main();
                }                            
                break;
                default: System.out.println("\f");
                System.out.println("Number inputted is Invalid!");
                System.out.println("Please try it again!"); 
                System.out.println();
                appoint();
            }
            break;
            case 2: System.out.println("Now, enter your city");
            System.out.println();
            for(int i=0;i<6;i++)
            {
                System.out.println("Enter "+i+" for "+cities[i]);
                System.out.println();
            }
            int choi = Integer.parseInt(br.readLine());
            System.out.println("\f");
            switch(choi)
            {
                case 0:for(int i=0;i<2;i++)
                {
                    System.out.println("Enter " + i + " for " + hosnm2[i]+ " Gemini Hospital");
                    System.out.println("");
                }
                enter = Integer.parseInt(br.readLine());
                if(enter==0)
                {

                    for(int i=0;i<3;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else if(enter==1)
                {

                    for(int i=3;i<6;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Number inputted is Invalid!");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                case 1:for(int i=2;i<4;i++)
                {
                    System.out.println("Enter " + i + " for " + hosnm2[i]+ " Gemini Hospital");
                    System.out.println("");
                }
                enter = Integer.parseInt(br.readLine());
                if(enter==2)
                {

                    for(int i=6;i<9;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else if(enter==3)
                {

                    for(int i=9;i<12;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Number inputted is Invalid!");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                case 2:for(int i=4;i<6;i++)
                {
                    System.out.println("Enter " + i + " for " + hosnm2[i]+ " Gemini Hospital");
                    System.out.println("");
                }
                enter = Integer.parseInt(br.readLine());
                if(enter==4)
                {

                    for(int i=12;i<15;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else if(enter==5)
                {

                    for(int i=15;i<18;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Number inputted is Invalid!");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                case 3:for(int i=0;i<2;i++)
                {
                    System.out.println("Enter " + i + " for " + hosnm2[i]+ " Gemini Hospital");
                    System.out.println("");
                }
                enter = Integer.parseInt(br.readLine());
                if(enter==0)
                {

                    for(int i=0;i<3;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else if(enter==1)
                {

                    for(int i=3;i<6;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Number inputted is Invalid!");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                case 4:for(int i=2;i<4;i++)
                {
                    System.out.println("Enter " + i + " for " + hosnm2[i]+ " Gemini Hospital");
                    System.out.println("");
                }
                enter = Integer.parseInt(br.readLine());
                if(enter==2)
                {

                    for(int i=6;i<9;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else if(enter==3)
                {

                    for(int i=9;i<12;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Number inputted is Invalid!");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                case 5:for(int i=4;i<6;i++)
                {
                    System.out.println("Enter " + i + " for " + hosnm2[i]+ " Gemini Hospital");
                    System.out.println("");
                }
                enter = Integer.parseInt(br.readLine());
                if(enter==4)
                {

                    for(int i=12;i<15;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else if(enter==5)
                {

                    for(int i=15;i<18;i++)
                    {
                        System.out.println("");
                        System.out.println("Doctor name  : Dr. " + docnm[i]); 
                        System.out.println("Speciality   : " + sepcia[i]); 
                        System.out.println("Availability : " + availa); 
                        System.out.println("Code: " + i);
                        System.out.println("");
                    }
                }
                else
                {
                    System.out.println("\f");
                    System.out.println("Number inputted is Invalid!");
                    System.out.println("Please try it again!"); 
                    System.out.println();
                    appoint();
                }
                break;
                default:System.out.println("\f");
                System.out.println("City inputted is either not in the option or spelling is wrong");                       
                System.out.println("Please try it again!"); 
                System.out.println();
                finalregis();
            }
            break;
            default: System.out.println("\f");
            System.out.println("Numbe inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            appoint();
        }
        System.out.println("Enter the code of the doctor you chose");
        code = Integer.parseInt(br.readLine());
        System.out.println("\f");
        finalregis();
    }

    static int mnth2=0,date2=0,yr2=0,hour2=0,min2=0;
    public static void finalregis()throws IOException 
    {
        System.out.println("Enter your First name");
        String frsnm1 = br.readLine();
        System.out.println();
        System.out.println("Enter your Last name");
        String lsnm1 = br.readLine();
        System.out.println();
        System.out.println("Enter your phno");
        String phone1 = br.readLine();
        System.out.println();
        if(phone1.length()!=10)
        {
            System.out.println("\f");
            System.out.println("Phno inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        System.out.println("Date of Appointment. Enter month");
        mnth2 = Integer.parseInt(br.readLine());
        System.out.println();   
        if(mnth2<0||mnth2>12)
        {
            System.out.println("\f");
            System.out.println("Month inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        System.out.println("Enter date");
        date2 = Integer.parseInt(br.readLine());
        System.out.println();
        if(date2<1||date2>31)
        {
            System.out.println("\f");
            System.out.println("Date inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        System.out.println("Enter year");
        yr2 = Integer.parseInt(br.readLine());
        System.out.println();   
        if(yr2<2016 || yr2>2017)
        {
            System.out.println("\f");
            System.out.println("Year inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        System.out.println("Enter time of appointment (Enter in the 24 hour clock)");
        System.out.println("Enter hour (ex.17)");
        hour2 = Integer.parseInt(br.readLine());
        System.out.println();
        if(hour2>=24)
        {
            System.out.println("\f");
            System.out.println("Hour inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        if(hour2<7&&hour2>=20)
        {
            System.out.println("\f");
            System.out.println("Our hospital is closed at that time");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        System.out.println("Enter minute (ex.00)");
        min2 = Integer.parseInt(br.readLine());
        System.out.println();
        if(min2>=60)
        {
            System.out.println("\f");
            System.out.println("Minute inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            finalregis();
        }
        System.out.println("\f");
        System.out.println("             Confirm your booking");
        System.out.println("");
        System.out.println("Doctor name  : Dr. " + docnm[code]); 
        System.out.println("Speciality   : " + sepcia[code]); 
        System.out.println("Hospital name: " + hosnm3[code] + " Gemini Hospital");
        System.out.println("Patient name : " + frsnm1 + " " + lsnm1);
        System.out.println("Date         : " + date2+" / "+mnth2+" / "+yr2);
        System.out.println("Time         : " + hour2 + ":" + min2);
        System.out.println("");
        System.out.println("Enter 1 to confirm your booking");
        we=Integer.parseInt(br.readLine());
        if(we==1)
        {
            System.out.println("\f");
            System.out.println("Your Booking is confirmed");
        }
        System.out.println("If you want to go back to the Main Menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }        
    }

    public static void ask()throws IOException
    {
        System.out.println("Enter 1 to know about first aid");
        System.out.println();
        System.out.println("Enter 2 know about Health Problems");
        int c1= Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(c1)
        {
            case 1: aid();
            break;
            case 2: health();
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            ask();
        }
    }

    public static void aid()throws IOException
    {
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter " + i + " for " + disea[i]);
            System.out.println();
        }
        int ent1= Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(ent1)
        {
            case 0:for(int i=0;i<4;i++)
            {
                System.out.println(bleed[i]);
                System.out.println();
            }   
            break;
            case 1:for(int i=0;i<3;i++)
            {
                System.out.println(frac[i]);
                System.out.println();
            } 
            break;
            case 2:for(int i=0;i<2;i++)
            {
                System.out.println(eye[i]);
                System.out.println();
            } 
            break;
            case 3:for(int i=0;i<3;i++)
            {
                System.out.println(uncons[i]);
                System.out.println();
            } 
            break;
            case 4:for(int i=0;i<1;i++)
            {
                System.out.println(heart[i]);
                System.out.println();
            } 
            break;
            case 5:for(int i=0;i<3;i++)
            {
                System.out.println(posion[i]);
                System.out.println();
            } 
            break;
            case 6:for(int i=0;i<2;i++)
            {
                System.out.println(snake[i]);
                System.out.println();
            } 
            break;
            case 7:for(int i=0;i<2;i++)
            {
                System.out.println();
                System.out.println();
            } 
            break;
            case 8:for(int i=0;i<3;i++)
            {
                System.out.println(sting[i]);
                System.out.println();
            } 
            break;
            default :System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            aid();
        }
        System.out.println();
        System.out.println();
        System.out.println();        
        System.out.println("If you want to go back to the Main Menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void health()throws IOException
    {
        for (int i=0;i<6;i++)
        {
            System.out.println("Enter " + i + " " + heapro[i]);
            System.out.println();
        }
        int ent1= Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(ent1)
        {
            case 0:for(int i=0;i<6;i++)
            {
                System.out.println(cold[i]);
                System.out.println();
            }  
            break;
            case 1:for(int i=0;i<6;i++)
            {
                System.out.println(hand[i]);
                System.out.println();
            } 
            break;
            case 2:for(int i=0;i<6;i++)
            {
                System.out.println(leg[i]);
                System.out.println();
            }
            break;
            case 3:for(int i=0;i<8;i++)
            {
                System.out.println(shoulder[i]);
                System.out.println();
            }
            break;
            case 4:for(int i=0;i<8;i++)
            {
                System.out.println(diabetes[i]);
                System.out.println();
            }
            break;
            case 5:for(int i=0;i<8;i++)
            {
                System.out.println(bp[i]);
                System.out.println();
            }
            break;
            default :System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            health();       
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("If you are not satisfied with these information, visit your nearest Gemini Hospital");
        System.out.println();
        System.out.println("Enter 'a' if you want to do online appointment booking");
        System.out.println("Enter any other key to go back to the main menu");
        String a5 = br.readLine();
        System.out.println("\f");
        if(a5.equalsIgnoreCase("a"))
        {
            appoint();
        }
        else
        {
            main();
        }
    }

    static String city4[] = {"Chennai","Bengaluru","Hyderabad","Thiruvananthapuram","Kolkata","Pune"};
    public static void contact()throws IOException
    {
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter "+i+" for "+city4[i]);
            System.out.println();
        }
        int a4 = Integer.parseInt(br.readLine());
        switch(a4)
        {
            case 0: r=0; p=2; n=0;
            break;
            case 1: r=2; p=6; n=0;
            break;
            case 2: r=4; p=6; n=0;
            break;
            case 3: r=0; p=2; n=1;
            break;
            case 4: r=2; p=4; n=1;
            break;
            case 5: r=4; p=6; n=1;
            break;
            default: contact();
            System.out.println("Number entered is invalid. Try again");
            System.out.println();
        }
        System.out.println("\f");
        if(n==0)
        {
            for(int i=r;i<p;i++)
            {
                System.out.println();
                System.out.println("Hospital name : " + hosnm[i] + " Gemini Hospital");
                System.out.println("Phno          : " + phno[i]);
                System.out.println("Address       : " + strnm[i]);
                System.out.println("                " + hosnm[i]);
                System.out.println("                " + plnm[i]);
                System.out.println("                " + postco[i]);
                System.out.println();
            }
        }        
        if(n==1)
        {
            for(int i=r;i<p;i++)
            {
                System.out.println();
                System.out.println("Hospital name : " + hosnm2[i] + " Gemini Hospital");
                System.out.println("Phno          : " + phno2[i]);
                System.out.println("Address       : " + strnm2[i]);
                System.out.println("                " + hosnm2[i]);
                System.out.println("                " + plnm2[i]);
                System.out.println("                " + postco2[i]);
                System.out.println();
            }
        }
        System.out.println(); 
        System.out.println("If you want to go back to the Main Menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void feedbk()throws IOException
    {
        System.out.println("Welcome to our Feedback Area");
        System.out.println();
        System.out.println("You can enter your feedback and let us know about how we can improve");
        System.out.println();
        System.out.println("Firstly, Enter your Name");
        nm = br.readLine();
        System.out.println();
        System.out.println("Now rate us:"); 
        System.out.println("You can rate us by entering 1 to 5 star");
        System.out.println();
        star = Integer.parseInt(br.readLine());
        if(star<=0||star>5)
        {
            System.out.println("\f");
            System.out.println("Rating number is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            feedbk();
        }
        else
        {
            System.out.println();
            System.out.println("Now enter your feedback");
            fdbk = br.readLine();
            System.out.println();
            System.out.println("Thank you for giving us your valuable feedback m(--)m");
        }
        System.out.println(); 
        System.out.println("If you want to go back to the Main Menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void prefdbk()throws IOException
    {
        System.out.println("        Previous Feedbacks");
        System.out.println();   

        for(int i=0;i<10;i++)
        {
            System.out.println();
            System.out.println("Name     : " + prefeed[i]);
            System.out.println("Rating   : " + rate[i]);
            System.out.println("Feedback : " + feed[i]);
            System.out.println();
        }
        if(star>=3)
        {
            System.out.println();
            System.out.println("Name     : " + nm);
            System.out.println("Rating   : " + star);
            System.out.println("Feedback : " + fdbk);
            System.out.println(); 
        }
        System.out.println(); 
        System.out.println("If you want to go back to the Main Menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void sgnup()throws IOException
    {
        System.out.println("Welcome to our Sign up Forum");
        System.out.println();
        System.out.println("Here you can see your previous appointments and transaction");
        System.out.println();
        System.out.println("Enter 1 to log in");
        System.out.println();
        System.out.println("Enter 2 to sign up");
        System.out.println();
        regis = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(regis)
        {
            case 1 : signu();
            break;
            case 2:  register();
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            sgnup();
        }
    }

    static String usrn [] ={"Aadil","Manish","Naru","Vishvajit"};
    static String passw[] = {"grapejelly1","grapejelly2",",grapejelly3","grapejelly4"};
    public static void signu()throws IOException
    {
        System.out.println("Enter your username");
        System.out.println();
        user = br.readLine();
        System.out.println("Enter your password");
        System.out.println();
        pass = br.readLine();
        System.out.println("\f");
        for(int i =0;i<4;i++)
        {
            if(user.equals(usrnm)&&pass.equals(psswr)||usrn[i].equals(user)&&passw[i].equals(pass))
            {
                hist();
            }
        }
        System.out.println("The user name and password entered is invalid");
        System.out.println();  
        System.out.println("If you want to go back to your main menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void hist()throws IOException
    {
        if(we==0)
        {
            System.out.println("You have no Medical appointment Booking");
        }
        else
        {
            System.out.println("             Your Mecial Appointment Booking");
            System.out.println("");
            System.out.println("Doctor name  : Dr. " + docnm[code]); 
            System.out.println("Speciality   : " + sepcia[code]); 
            System.out.println("Hospital name: " + hosnm3[code] + " Gemini Hospital");
            System.out.println("Date         : " + date2+" / "+mnth2+" / "+yr2);
            System.out.println("Time         : " + hour2 + ":" + min2);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Enter 1 to view your recent purchase");
        int u7=Integer.parseInt(br.readLine());
        if(u7==1)
        {
            if(u8==1)
            {
                bill();
            }
            else
            {
                System.out.println("You haven't done any purchase at our online pharmacy");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println();  
        System.out.println("If you want to go back to your main menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void register()throws IOException
    {
        System.out.println("Here you can make your own account");
        System.out.println();
        System.out.println("Enter your First name");
        frsnm =br.readLine();
        System.out.println();
        System.out.println("Enter your Last name");
        lsnm = br.readLine();
        System.out.println();
        System.out.println("Username");
        usrnm = br.readLine();
        System.out.println();
        System.out.println("Password (Should be ore than 8 characters");
        psswr = br.readLine();
        System.out.println();
        System.out.println("Enter password again");
        psswr2 = br.readLine();
        System.out.println();
        System.out.println("phno");
        phone =br.readLine();
        System.out.println();
        if(phone.length()!=10)
        {
            System.out.println("\f");   
            System.out.println("Phno entered is Invalid!");  
            pass="";
            user="";
            System.out.println("Please try it again!"); 
            System.out.println();
            register();
        }
        System.out.println("Date of birth. Enter month");
        mnth = Integer.parseInt(br.readLine());
        System.out.println();   
        if(mnth<0||mnth>12)
        {
            System.out.println("\f");   
            System.out.println("Month entered is Invalid!");  
            pass="";
            user="";
            System.out.println("Please try it again!"); 
            System.out.println();
            register();
        }
        System.out.println("Enter date");
        date = Integer.parseInt(br.readLine());
        System.out.println();
        if(date<1||date>31)
        {
            System.out.println("\f");   
            System.out.println("Date entered is Invalid!");  
            pass="";
            user="";
            System.out.println("Please try it again!"); 
            System.out.println();
            register();
        }
        System.out.println("Enter year");
        yr = Integer.parseInt(br.readLine());
        System.out.println();   
        if(yr<2003)
        {
            System.out.println("\f");   
            System.out.println("Year entered is Invalid!");  
            pass="";
            user="";
            System.out.println("Please try it again!"); 
            System.out.println();
            register();
        }
        if(psswr.equals(psswr2))
        {
            if(psswr.length()>=8)
            {
                System.out.println("You have sucessfully created a new account!");
                System.out.println();
                System.out.println("Enter 1 to sign in to your account");
                int a = Integer.parseInt(br.readLine());
                System.out.println("\f");
                if(a==1)
                {
                    signu();
                }
            }
            else
            {
                System.out.println("\f");   
                System.out.println("The password charcter is too small!");  
                pass="";
                user="";
                System.out.println("Please try it again!"); 
                System.out.println();
                register();
            }
        }
        else
        {
            System.out.println("\f");   
            System.out.println("The password you have re-entered is invalid!");
            pass="";
            user="";
            System.out.println("Please try it again!"); 
            System.out.println();
            register();
        }
        System.out.println();  
        System.out.println("If you want to go back to your main menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }

    public static void retail()throws IOException
    {
        System.out.println("           Welcome to Gemini Pharmacy"); 
        System.out.println();
        System.out.println("Here you can buy Mecinices that are approved by the Inidan Government");
        System.out.println();
        System.out.println("Enter 0 for prescibed medicines (You get a discount if your medicine is prescribed (10%))");
        System.out.println();
        System.out.println("Enter 1 for un-prescribed medicines");
        int a1= Integer.parseInt(br.readLine());
        System.out.println("\f");
        price =0;
        total =0;
        namemed = "";
        count++;
        switch(a1)
        {
            case 0: pres();
            break;
            case 1: unpres();
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            retail();
        }
    }

    public static void pres()throws IOException
    {
        System.out.println("Enter the Doctor's name that has prescribed the medicine");
        System.out.println("(do not add 'Dr.')");
        String a2 = br.readLine();
        for(int i=0;i<36;i++)
        {
            if(a2.equalsIgnoreCase(docnm[i]))
            {
                System.out.println("\f");
                System.out.println("The name given is valid");
                System.out.println();
                discount = (int)(Math.random()*90000+10000);
                System.out.println("Your discount code is "+discount);
                System.out.println();
                System.out.println("Enter 1 to go to our Online Gemini Pharmacy");
                int c1 = Integer.parseInt(br.readLine());
                if(c1==1)
                {
                    System.out.println("\f");
                    unpres();
                }
                else
                {
                    main();
                }
            }
        }
    }

    public static void unpres()throws IOException
    {
        for(int i=0;i<4;i++)
        {
            System.out.println();
            System.out.println("Enter "+i+" for "+medicine[i]);
        }
        choic2 = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(choic2)
        {
            case 0: firstaid();
            break;
            case 1: oint();
            break;
            case 2: tablet();
            break;
            case 3: head();
            break;
            default:System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            unpres();
        }
    }

    public static void firstaid()throws IOException
    { 
        for(int i=0;i<10;i++)
        {
            System.out.println();
            System.out.println("Enter "+i+" to buy "+firstai[i]);
        }
        choice3 = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(choice3)
        {
            case 0: price =30;
            namemed = "Bandage";
            break;
            case 1: price =75;
            namemed = "Antiseptic Cream";
            break;
            case 2: price =60;
            namemed = "Insect Spray";
            break;
            case 3: price =50;
            namemed = "Thermometer";
            break;
            case 4: price =50;
            namemed = "alcohol-free cleansing wipes";
            break;
            case 5: price =100;
            namemed = "Guaze roll";
            break;
            case 6: price =40;
            namemed = "Eye shield (eye pad)";
            break;
            case 7: price =60;
            namemed = "Elastic bandages";
            break;
            case 8: price =40;
            namemed = "Hand sanitizer";
            break;
            case 9: System.out.println("The itmes we have in this kit are:");
            for(int i=0;i<14 ;i++)
            {
                System.out.println(kit[i]);
            }
            price = 500;
            namemed = "Gemini First Aid Kit";
            System.out.println();
            System.out.println();
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            firstaid();
        }
        ammount();
    }

    public static void oint()throws IOException
    {
        for(int i=0;i<5;i++)
        { 
            System.out.println();
            System.out.println("Enter "+i+" to buy "+ointm[i]);
        }
        choice4 = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(choice4)
        {
            case 0: price =100;
            namemed = "Moov Ointment";
            break;
            case 1: price =110;
            namemed = "Tiger Balm";
            break;
            case 2: price =130;
            namemed = "Sallaki Oil";
            break;
            case 3: price =150;
            namemed = "Vollini";
            break;
            case 4: price =100;
            namemed = "Healing Ointment";
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            oint();
        }
        ammount();
    }

    public static void tablet()throws IOException
    {
        for(int i=0;i<4;i++)
        {
            System.out.println();
            System.out.println("Enter "+i+" to buy "+tablets[i]);
        }
        choice4 = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(choice4)
        {
            case 0: price =50;
            namemed = "Mild Fever Tablets";
            break;
            case 1: price =30;
            namemed = "Cough Drops";
            break;
            case 2: price =60;
            namemed = "Strong Fever Tablets";
            break;
            case 3: price =40;
            namemed = "Ayurvedic Fever Tablet";
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            tablet();
        }
        ammount();
    }

    public static void head()throws IOException
    {
        for(int i=0;i<4;i++)
        {
            System.out.println();
            System.out.println("Enter "+i+" to buy "+heads[i]);
        }
        choice4 = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(choice4)
        {
            case 0: price =120;
            namemed = "Aspirin";
            break;
            case 1: price =30;
            namemed = "Head ache Tablets";
            break;
            case 2: price =30;
            namemed = "Stomach ache Tablets";
            break;
            case 3: price =40;
            namemed = "Head massage oil";
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            head();
        }
        ammount();
    }

    public static void ammount() throws IOException
    {
        System.out.println("Enter the amount you want to buy");
        amount = Integer.parseInt(br.readLine());
        System.out.println("\f");
        total = amount * price;
        totalpayment = totalpayment + total;
        for(k=count-1;k<count;k++)
        {
            rec[k]=total;
            namemed1[k]=namemed;
            amount1[k]=amount;
        }
        System.out.println("Enter c to continue shopping");
        System.out.println("Enter any other key to do your payment");
        conti = br.readLine();
        System.out.println("\f");
        if(conti.equals("c"))
        {
            unpres();
        }
        else
        {
            payment();
        }
    }

    public static void payment()throws IOException
    {
        System.out.println("Enter 1 if you have a discount code");
        int discode = Integer.parseInt(br.readLine());
        if(discode==1)
        {
            System.out.println("Enter you discount code");
            int discode2 = Integer.parseInt(br.readLine());
            if(discode2==discount)
            { 
                System.out.println("Discount code is Valid");
                totalpayment = totalpayment - (totalpayment*0.1);
                f2 = 2;
            }
            else
            {
                System.out.println("\f");
                System.out.println("Discount code is invalid");
                System.out.println("Try again");
                System.out.println();
                payment();
            }
        }
        System.out.println("\f");
        for(int i=0;i<count;i++)
        {            
            System.out.println((i+1)+". "+namemed1[i]+"   amount= " +amount1[i]+ "   Total = Rs."+rec[i]);
            System.out.println();
        }
        tax = totalpayment*0.14;
        totalpayment=tax+totalpayment;
        System.out.println("Tax = Rs." + tax);
        if(f2==2)
        {
            System.out.println("Discount = Rs."+totalpayment*0.1);
        }
        System.out.println();
        System.out.println("Total payment = Rs." + (int)totalpayment);
        System.out.println();
        System.out.println();
        System.out.println("Enter 1 to pay in Debit Card");
        System.out.println();
        System.out.println("Enter 2 for Cash-in Delivery");
        cho = Integer.parseInt(br.readLine());
        System.out.println("\f");
        switch(cho)
        {
            case 1: credit(); 
            break;
            case 2: address();
            break;
            default: System.out.println("\f");
            System.out.println("Number inputted is Invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            payment();                  
        }
    }

    public static void credit()throws IOException
    {
        System.out.println("Enter your credit card number");
        String credit = br.readLine();
        if(credit.length()!=16)
        { 
            System.out.println("\f"); 
            System.out.println("Credit Card number inputted is invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            credit();
        }
        System.out.println();
        System.out.println("Enter the CVV number of your card");
        String cvv = br.readLine();
        if(cvv.length()!=3)
        { 
            System.out.println("\f");             
            System.out.println("CVV number inputted is invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            credit();
        }
        System.out.println("\f");
        address();
    }

    public static void address()throws IOException
    {
        System.out.println("Enter your Adress");
        System.out.println("Enter City name");
        cit = br.readLine();
        System.out.println();
        System.out.println("Enter Postal Code");
        postal = br.readLine();
        if(postal.length()!=6)
        { 
            System.out.println("\f");
            System.out.println("Postal Code inputted is invalid!");
            System.out.println("Please try it again!"); 
            System.out.println();
            address();
        }
        System.out.println();
        System.out.println("Enter locality");
        loca = br.readLine();
        System.out.println();
        System.out.println("Enter rest of your address");
        adres = br.readLine();
        System.out.println();
        System.out.println();
        System.out.println("Thank you for your purchase!");
        System.out.println("Your item(s) will be delivered within a week");
        System.out.println();
        System.out.println("\f");
        System.out.println("Thank you for purchasing!");
        System.out.println();
        System.out.println("Enter b to see your bill");
        u8 = 1;
        System.out.println();
        System.out.println("Enter any other key  to go back to main menu");
        cho1 = br.readLine();
        if(cho1.equalsIgnoreCase("b"))
        {
            System.out.println("\f");
            bill();
        }
        else
        {
            totalpayment = 0;
            main();
        }
    }

    public static void bill()throws IOException
    {
        for(int i=0;i<count;i++)
        {            
             System.out.println((i+1)+". "+namemed1[i]+"   amount= " +amount1[i]+ "   Total = Rs."+rec[i]);
             System.out.println();
        }
        tax = totalpayment*0.14;
        totalpayment=tax+totalpayment;
        System.out.println("Tax = Rs." + tax);
        if(f2==2)
        {
            System.out.println("Discount = Rs."+totalpayment*0.1);
        }
        System.out.println();
        System.out.println("Total payment = Rs." + (int)totalpayment);
        totalpayment = 0;
        System.out.println();
        System.out.println();
        System.out.println();  
        System.out.println("If you want to go back to your main menu, enter 1");
        int c= Integer.parseInt(br.readLine());
        System.out.println("\f");
        if(c==1)
        {
            main();
        }
    }
}
