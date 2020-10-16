# Research Practicum 2020: Research Plan


> * Group Name: Team McQuarantine Milton
> * Group participants names: Chathura Don Dimungu Arachchige, Bradley Brown, Devin Inthavongsa, and Mathew Rubio
> * Project Title: UCF 2020 Football Season Home Game Spectator COVD Transmission 

## 1. Topic / Introduction

While health and science professionals continue to understand the nuances of COVID epidemiology, certain mitigation strategies appear to be successful in significantly reducing transmission.
As research continues, governing bodies in the form of national, state, local, education, military, and business are enacting different mitigation efforts based on balancing risk and economic need.
UCF athletics is one such organization. As the 2020 college football season starts,
college athletic programs around the nation are employing different COVID mitigation strategies for live attendance, from canceling the season to limiting spectators.  Although not allowing any spectators is the most risk-averse mitigation strategy many college athletic programs rely on home-game football ticket sales to meet budgetary benchmarks.  For example, the 20-21 UCF athletics budget is $74 million, with a significant portion coming from spectator ticket sales [(Murchel, 2020)](https://www.orlandosentinel.com/sports/ucf-knights/os-sp-ucf-athletics-budget-fundraising-20200723-uxpaa6gjlffmpdfpoc6jikag4m-story.html).

To retain some spectator revenue, UCF plans to fill 25% (no more than 11 thousand) of the Bounce House for the opening football season game.  People who decide to attend the game are required to wear a facemask; social distancing is encouraged but not enforced.  The stadium is divided into seven zones, and movement on the concourse from zone to zone is not permitted.  The current mitigation strategy will prevent overcrowding, limit intermingling, and enable physical distancing throughout the stadium.  [(UCF Athletics; Lee, 2020)](https://www.ucf.edu/news/what-fans-need-to-know-for-ucfs-2020-football-season/)

## 2. Purpose Statement

The **purpose** of the research is to determine is UCF football game attendance COVID countermeasures are appropriate in minimizing virus spread potential while maximizing attendance revenue. Using an agent-based model,  the study will determine predicted COVID transmission under current UCF athletics countermeasures and investigate  higher attendance numbers under current mitigation strategies to determine if higher attendance is possible with nominal risk.

## 3. Related Work/Review

Discuss briefly about published matter that technically relates to your proposed work in 4-5 paragraphs.

## 4. Research Method
### Overview
The methodology seeks to establish the baseline COVID transmission risk with current attendee mitigation strategies (25% capacity, zone segregation). Followed by testing to identify at what attendance threshold and combination of mitigation strategies allow for increased home game attendance without increasing COVID transmission risk.
  
The participants for our experiment are simulated football game attendees using anylogic. One mitigation strategy for UCF home games is segregating the stadium into seven unilateral sections that cannot interact with each other, which means that each section has its own entry/exit, bathrooms, and concessions. Our population consists of 25% capacity of one such section, a total of 1,618 simulated spectators. We may increase the simulated population depending upon our capability to increase the simulation scope as we continue to build the model. The simulation agents are unique to our study in two ways. First, the agents will have a 6 ft. boundary around each that will help us measure the number of contacts each agent has with other agents. Second, the agents will be capable of being a part of different sized groups, a transmission variable we plan to test.  

Our primary tool is anylogic. We plan to construct an agent-based simulation that allows us to adjust the population, movement patterns, and group sizes. The primary output of our agent base simulation is to identify the number of contacts between unique agents. The agent contact data will inform the Ro value in a separate SIR simulation to provide infection statistics under changing variables.  

The dependent variables for our experiment are the number of agent contacts and attendee infection rate. Independent variables are the attendance capacity and attendee group sizes. Our control variable is mask wearing as a function of Ro. A draft table of our experiment framework is below. 

![results table](Images/resultstable.png)

The experiment process follows the table above. Data will be collected using anylogic analytics and include agent contact statistics and infection statistics based on research-informed 
Ro values and the initial value of the SIR infection. In addition to the statistical analysis, we will complete each simulation trial with a heatmap that identifies high agent contact areas. 
Depending on experimental findings and capabilities, we may add a final phase to the experiment that finds the optimal attendance capacity and group size limitations that maximizes COVID attendance 
with no increase in infection rates. 

### 4.1 Reseach Questions

Are current COVID football attendance limitation and social distancing strategies appropriate for maximizing attendance and minimizing transmission risk, while controlling for the masked COVID transmission rate?

### 4.2 Hypothesis

**Hypothesis 1:**
The number of expected infections proportional to the squared value of the attendance.

**Hypothesis 2:**
The group size does affect the number of infections (or number of contacts).

**Hypothesis 3:**
The number of expected infections is proportional to the group size.

**Hypothesis 4:**
The number of infections is not proportional to attendance capacity

### 4.3 Variables

**Independent:**
Stadium capacity and social distancing (group size), group strategy

**Dependent:**
transmission rate, number of contacts

**Control:**
Masked interpersonal transmission rate

### 4.4 Materials / Apparatus

* Anylogic agent model
* Anylogic SIR model

### 4.5 Participants

* 1,600 agent spectators
  * 6' contact zone
  * Grouping behaviors
  * Food/Bathroom behaviors

## 5. Model Demo



## PPT

**Midterm PowerPoint**
 [![PPT images](Images/MidtermPPT.png)](Presentations)


## References (unformated right now)
(Add the bibliographic references you intend to use in format you want)

https://www.orlandosentinel.com/sports/ucf-knights/os-sp-ucf-athletics-budget-fundraising-20200723-uxpaa6gjlffmpdfpoc6jikag4m-story.html

https://www.ucf.edu/news/what-fans-need-to-know-for-ucfs-2020-football-season/

https://sports.usatoday.com/2020/07/05/methodology-for-2019-ncaa-athletic-department-revenue-database/

Ronald, N., Sterling, L., & Kirley, M. (2007). An agent-based approach to modelling pedestrian behaviour. International Journal of Simulation, 8(1), 25-38.

Siyam, N., Alqaryouti, O., & Abdallah, S. (2019). Research Issues in Agent-Based Simulation for Pedestrians Evacuation. IEEE Access, 8, 134435-134455.

Pathophysiology, Transmission, Diagnosis, and Treatment of Coronavirus Disease 2019 (COVID-19)” ( doi :10.1016/S0140-6736(20)31142-9 )

Physical distancing, face masks, and eye protection to prevent person-to-person transmission of SARS-CoV-2 and COVID-19: a systematic review and meta-analysis” (doi : https://doi.org/10.1016/S0140-6736(20)31142-9) 

Zhiming Fang1,#,*, Zhongyi Huang1,#, Xiaolian Li2,#,*, Jun Zhang3 , Wei Lv4 , Lei Zhuang5 , Xingpeng Xu1 , Nan Huang1 How many infections of COVID-19 there will be in the “Diamond Princess”- Predicted by a virus transmission model based on the simulation of crowd flow https://arxiv.org/ftp/arxiv/papers/2002/2002.10616.pdf 

Anass Bouchnita ∗, Aissam Jebrane “A hybrid multi-scale model of COVID-19 transmission dynamics to assess the potential of non-pharmaceutical interventions” https://www.sciencedirect.com/science/article/pii/S0960077920303404?casa_token=It_NawpEwfUAAAAA:yOCsDOdT_8y1PFQ2cypB6o1IQRARaAfBFGCkl0OMqnq1_ibmzLBTY7tJ2FAwBaDBzdj1kIvNKA 

Marco D’Orazio1 , Gabriele Bernardini1 , Enrico Quagliarini1  How to restart? An agent-based simulation model towards the definition of strategies for COVID-19 “second phase” in public buildings https://arxiv.org/ftp/arxiv/papers/2004/2004.12927.pdf 








