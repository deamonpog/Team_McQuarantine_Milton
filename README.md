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

Severe acute respiratory syndrome coronavirus 2 (SARS-CoV-2) causes COVID-19, and its mechanism of spreading is primarily driven through close person-to-person interaction. Ongoing studies and analyses of previous epidemiological data are currently underway in predicting the infection mechanism and rate of SARS-CoV-2. It is not definitely known if SARS-CoV-2 might spread through aerosols from respiratory droplets so far; sampling the air has found viral replicative material (viral RNA) in some studies, but not in others. However, finding viral RNA is not necessarily indicative of the virus' replicative and infective potential. Furthermore, the distance from which an infected individual infects another individual, as well as the optimal person-to-person physical distance, is uncertain. Because of such, quantitative assessment of physical distancing is essential in determining safe interaction in healthcare settings, non-healthcare settings, and providing important information for health policy-makers in preventing the spread of the virus.

Chu et al. (2020) published a large meta-analysis paper identifying 172 observational studies across 16 countries, with no randomized controlled trials and 44 relevant comparative studies in both healthcare and non-healthcare settings. The findings of this paper is one of the first to rapidly gather all direct information on COVID-19, and provide the best available evidence to inform optimal usages of common and simple interventions to aid in the reduction of the rate of infection. Physical distancing of 1 meter or more was associated with a drastically lowered risk of infection, as was the usage of face masks including N95 respirators and surgical masks. The authors found evidence of moderate certainty that currently placed policies of at least 1 meter physical distancing are probably associated with a large reduction in infection rates, and further suggests that distances of 2 meter might be more effective (implemented in some countries).

Furthermore, Chu et al. (2020) expressed that usage of face masks were protective of both healthcare workers and people in communal settings exposed to infection, stating that their frequentist and Bayesian analyses support the protective role of facemask utilization regardless of the setting. Some of the strengths of this paper include the researchers' adherence to systematic review methods that involved artificial intelligence-supported dual screening of titles, abstract, full-text evaluations, assessment of risk of biases, and no language limitations. The researchers, however, did not go into depth the full incorporation and explanation of the artificial intelligence other than through mention in their acknowledgements section. The primary limitation of this meta-analyses paper is that all the studies involved were non-randomized, not adjusted, and may suffer from recall and measurement bias.

Jarvis et al. (2020) published a paper centered around the estimation of 'R naught' (R0) in the United Kingdom (UK). R0 is the potential transmission of a disease; R0 < 1 - each existing infection causes less than one new infection; R0 = 1 - each existing infection causes one new infection; R0 > 1 - each existing infection causes more than one new infection and may cause an outbreak or epidemic. The universally accepted R0 for SARS-CoV-2 is still uncertain, but this study seeks to establish some metric to base viral-spread interventions, especially through physical distancing measures that may lead to substantial decreases in contact levels. This study asked a representative sample of UK adults (1356 UK participants) about their contact patterns on the day prior and recorded 3849 contacts. The estimation of R0 prior to lockdown (in the UK) was 2.6, and the authors found that, under current social distancing measures, the current R0 estimation was lowered to 0.62 based on all types of contact.

Tang et al. (2020) sought to determine the aerosol transmission of SARS-CoV-2. The evaluation of the evidence of SARS-CoV-2 aerosol transmission is based on three criteria: (1) virus-containing aerosols are generated by or from an infectious person, (2) the virus remains viable and infective in the aerosols for some period of time, (3) the target tissues where the virus initiates infection are accessible to the aerosol with enough load. The viral load of SARS-CoV-2 is higher in the lungs compared to the upper respiratory tract, and infections with a higher viral load in the upper respiratory tract may be more likely to be droplet spread. A singular cough can produce about 3000 droplets, while a sneeze can produce about 40000 droplets, most of which are small droplets (about 1-10 micrometers). However, during normal breathing, 80 to 90% of droplet sizes are less than 1 micrometer and subject to aerosol transport. Because breathing and speaking occur more frequently than coughing or sneezing, they may play a much impactful role in viral transmission. In COVID-19, the average virus RNA (genetic material) load in oral fluid was determined to be 7 x 10^6 copies / mL. Utilizing laser light-scattering observation, at the average viral load of 7 x 10^6 / mL, 1 minute of loud speaking can produce thousands of oral droplets per second, of these droplets at least 1000 virus-containing droplets can remain airborne for more than 8 minutes.

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

Jarvis, C.I., Van Zandvoort, K., Gimma, A. et al. Quantifying the impact of physical distance measures on the transmission of COVID-19 in the UK. BMC Med 18, 124 (2020). https://doi.org/10.1186/s12916-020-01597-8

Tang, S., Mao, Y., Jones, R. M., Tan, Q., Ji, J. S., Li, N., Shen, J., Lv, Y., Pan, L., Ding, P., Wang, X., Wang, Y., MacIntyre, C. R., & Shi, X. (2020). Aerosol transmission of SARS-CoV-2? Evidence, prevention and control. Environment international, 144, 106039. https://doi.org/10.1016/j.envint.2020.106039
