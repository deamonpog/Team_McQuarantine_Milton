package network_test_mod;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import java.awt.geom.Arc2D;

 

public class Main extends Agent
{
  // Parameters

 
  public 
int  populationSize;

  /**
   * Returns default value for parameter <code>populationSize</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _populationSize_DefaultValue_xjal() {
    final Main self = this;
    return 
250 
;
  }

  public void set_populationSize( int populationSize ) {
    if (populationSize == this.populationSize) {
      return;
    }
    int _oldValue_xjal = this.populationSize;
    this.populationSize = populationSize;
    onChange_populationSize_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter populationSize.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_populationSize()</code> method instead.
   */
  protected void onChange_populationSize() {
    onChange_populationSize_xjal( populationSize );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_populationSize_xjal( int oldValue ) {

 
;  
  }


 
  @AnyLogicCustomProposalType(AnyLogicCustomProposalType.Label.MINUTE)
  public 
double  meaninfectionduration;

  /**
   * Returns default value for parameter <code>meaninfectionduration</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _meaninfectionduration_DefaultValue_xjal() {
    final Main self = this;
    return 
10 
;
  }

  public double meaninfectionduration( TimeUnits _units ) {
    return MINUTE.convertTo( meaninfectionduration, _units );
  }

  public void set_meaninfectionduration( double meaninfectionduration, TimeUnits _units ) {
    set_meaninfectionduration( _units.convertTo( meaninfectionduration, MINUTE ) );
  }

  public void set_meaninfectionduration( double meaninfectionduration ) {
    if (meaninfectionduration == this.meaninfectionduration) {
      return;
    }
    double _oldValue_xjal = this.meaninfectionduration;
    this.meaninfectionduration = meaninfectionduration;
    onChange_meaninfectionduration_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter meaninfectionduration.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_meaninfectionduration()</code> method instead.
   */
  protected void onChange_meaninfectionduration() {
    onChange_meaninfectionduration_xjal( meaninfectionduration );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_meaninfectionduration_xjal( double oldValue ) {

 
;  
  }

  
  /**
   * Internal method. Returns the units used in design-time for setting the code of this parameter (these units may be e.g. used for adaptation of dynamic parameter arguments)
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsForCodeOf_meaninfectionduration() {
    return MINUTE;
  }
  
  /**
   * Internal method. Returns the units of this parameter.
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsOf_meaninfectionduration() {
    return MINUTE;
  }

 
  @AnyLogicCustomProposalType(AnyLogicCustomProposalType.Label.MINUTE)
  public 
double  meanlatencyduration;

  /**
   * Returns default value for parameter <code>meanlatencyduration</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _meanlatencyduration_DefaultValue_xjal() {
    final Main self = this;
    return 
3 
;
  }

  public double meanlatencyduration( TimeUnits _units ) {
    return MINUTE.convertTo( meanlatencyduration, _units );
  }

  public void set_meanlatencyduration( double meanlatencyduration, TimeUnits _units ) {
    set_meanlatencyduration( _units.convertTo( meanlatencyduration, MINUTE ) );
  }

  public void set_meanlatencyduration( double meanlatencyduration ) {
    if (meanlatencyduration == this.meanlatencyduration) {
      return;
    }
    double _oldValue_xjal = this.meanlatencyduration;
    this.meanlatencyduration = meanlatencyduration;
    onChange_meanlatencyduration_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter meanlatencyduration.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_meanlatencyduration()</code> method instead.
   */
  protected void onChange_meanlatencyduration() {
    onChange_meanlatencyduration_xjal( meanlatencyduration );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_meanlatencyduration_xjal( double oldValue ) {

 
;  
  }

  
  /**
   * Internal method. Returns the units used in design-time for setting the code of this parameter (these units may be e.g. used for adaptation of dynamic parameter arguments)
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsForCodeOf_meanlatencyduration() {
    return MINUTE;
  }
  
  /**
   * Internal method. Returns the units of this parameter.
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsOf_meanlatencyduration() {
    return MINUTE;
  }

 
  @AnyLogicCustomProposalType(AnyLogicCustomProposalType.Label.MINUTE)
  public 
double  meanimmunityduration;

  /**
   * Returns default value for parameter <code>meanimmunityduration</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _meanimmunityduration_DefaultValue_xjal() {
    final Main self = this;
    return 
50 
;
  }

  public double meanimmunityduration( TimeUnits _units ) {
    return MINUTE.convertTo( meanimmunityduration, _units );
  }

  public void set_meanimmunityduration( double meanimmunityduration, TimeUnits _units ) {
    set_meanimmunityduration( _units.convertTo( meanimmunityduration, MINUTE ) );
  }

  public void set_meanimmunityduration( double meanimmunityduration ) {
    if (meanimmunityduration == this.meanimmunityduration) {
      return;
    }
    double _oldValue_xjal = this.meanimmunityduration;
    this.meanimmunityduration = meanimmunityduration;
    onChange_meanimmunityduration_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter meanimmunityduration.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_meanimmunityduration()</code> method instead.
   */
  protected void onChange_meanimmunityduration() {
    onChange_meanimmunityduration_xjal( meanimmunityduration );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_meanimmunityduration_xjal( double oldValue ) {

 
;  
  }

  
  /**
   * Internal method. Returns the units used in design-time for setting the code of this parameter (these units may be e.g. used for adaptation of dynamic parameter arguments)
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsForCodeOf_meanimmunityduration() {
    return MINUTE;
  }
  
  /**
   * Internal method. Returns the units of this parameter.
   */
  @AnyLogicInternalCodegenAPI
  public TimeUnits getUnitsOf_meanimmunityduration() {
    return MINUTE;
  }

 
  @AnyLogicCustomProposalType(AnyLogicCustomProposalType.Label.PER_MINUTE)
  public 
double  contactRate;

  /**
   * Returns default value for parameter <code>contactRate</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _contactRate_DefaultValue_xjal() {
    final Main self = this;
    return 
1.0 
;
  }

  public double contactRate( RateUnits _units ) {
    return PER_MINUTE.convertTo( contactRate, _units );
  }

  public void set_contactRate( double contactRate, RateUnits _units ) {
    set_contactRate( _units.convertTo( contactRate, PER_MINUTE ) );
  }

  public void set_contactRate( double contactRate ) {
    if (contactRate == this.contactRate) {
      return;
    }
    double _oldValue_xjal = this.contactRate;
    this.contactRate = contactRate;
    onChange_contactRate_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter contactRate.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_contactRate()</code> method instead.
   */
  protected void onChange_contactRate() {
    onChange_contactRate_xjal( contactRate );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_contactRate_xjal( double oldValue ) {

 
;  
  }

  
  /**
   * Internal method. Returns the units used in design-time for setting the code of this parameter (these units may be e.g. used for adaptation of dynamic parameter arguments)
   */
  @AnyLogicInternalCodegenAPI
  public RateUnits getUnitsForCodeOf_contactRate() {
    return PER_MINUTE;
  }
  
  /**
   * Internal method. Returns the units of this parameter.
   */
  @AnyLogicInternalCodegenAPI
  public RateUnits getUnitsOf_contactRate() {
    return PER_MINUTE;
  }

  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    populationSize = _populationSize_DefaultValue_xjal();
    meaninfectionduration = _meaninfectionduration_DefaultValue_xjal();
    meanlatencyduration = _meanlatencyduration_DefaultValue_xjal();
    meanimmunityduration = _meanimmunityduration_DefaultValue_xjal();
    contactRate = _contactRate_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "populationSize":
      if ( _callOnChange_xjal ) {
        set_populationSize( ((Number) _value_xjal).intValue() );
      } else {
        populationSize = ((Number) _value_xjal).intValue();
      }
      return true;
    case "meaninfectionduration":
      if ( _callOnChange_xjal ) {
        set_meaninfectionduration( ((Number) _value_xjal).doubleValue() );
      } else {
        meaninfectionduration = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "meanlatencyduration":
      if ( _callOnChange_xjal ) {
        set_meanlatencyduration( ((Number) _value_xjal).doubleValue() );
      } else {
        meanlatencyduration = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "meanimmunityduration":
      if ( _callOnChange_xjal ) {
        set_meanimmunityduration( ((Number) _value_xjal).doubleValue() );
      } else {
        meanimmunityduration = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "contactRate":
      if ( _callOnChange_xjal ) {
        set_contactRate( ((Number) _value_xjal).doubleValue() );
      } else {
        contactRate = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "populationSize": _result_xjal = populationSize; break;
    case "meaninfectionduration": _result_xjal = meaninfectionduration; break;
    case "meanlatencyduration": _result_xjal = meanlatencyduration; break;
    case "meanimmunityduration": _result_xjal = meanimmunityduration; break;
    case "contactRate": _result_xjal = contactRate; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "populationSize" );
      list.add( "meaninfectionduration" );
      list.add( "meanlatencyduration" );
      list.add( "meanimmunityduration" );
      list.add( "contactRate" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // Embedded Objects

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _population_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);

  public String getNameOf( Agent ao ) {
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _population_Population extends AgentArrayList<person> {
    _population_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public person instantiateAgent( int index ) {
    	return instantiate_population_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( person agent, int index, TableInput tableInput ) {
      setupParameters_population_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( person agent, int index, TableInput tableInput ) {
      doBeforeCreate_population_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }

  }
  
 
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "person")
  public _population_Population population = new _population_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == population ) return "population";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    if( aolist == population ) return _population_animationSettings_xjal;
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in population
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public person population(int index) {
    return population.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection population<br>
   * @return newly created embedded object
   */
  public person add_population() {
    int index = population.size();
    person _result_xjal = instantiate_population_xjal( index );
    population.callSetupParameters( _result_xjal, index );
    population.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection population<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object population - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to population
   */
  public boolean remove_population( person object ) {
    if( ! population._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected person instantiate_population_xjal( final int index ) {
    person _result_xjal = new person( getEngine(), this, population ) {
      // Additional class code

 
      // End of additional class code
	};
    
    population._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_population_xjal( final person self, final int index, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_population_xjal( person self, final int index, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
    self.setEnvironment( this );
    double _x_xjal = 
uniform(0.0, this.spaceWidth()) 
;
    double _y_xjal = 
uniform(0.0, this.spaceHeight()) 
;
    double _z_xjal = 
0 
;
    self.setXYZ( _x_xjal, _y_xjal, _z_xjal );
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );

    // Port connections
  }

  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _population_presentation = 1;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 2;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(population_presentation);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _population_presentation:
        if (true) {
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _population_presentation_SetDynamicParams_xjal( ShapeEmbeddedObjectPresentation shape, int index ) {
    boolean _visible = _population_presentation_Visible();
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setRotation(
 
);
 	}
  }
  
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private boolean _population_presentation_Visible() {
    return 
 
;
  }
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _population_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, 0.0, 0.0, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup population_presentation;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    population_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, population) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _population_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
      
      @Override
      public void setShapeDynamicProperties_xjal( ShapeEmbeddedObjectPresentation shape, int index ) {
        _population_presentation_SetDynamicParams_xjal( shape, index );
      }
    };
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( int populationSize, double meaninfectionduration, double meanlatencyduration, double meanimmunityduration, double contactRate ) {
    markParametersAreSet();
    this.populationSize = populationSize;
    this.meaninfectionduration = meaninfectionduration;
    this.meanlatencyduration = meanlatencyduration;
    this.meanimmunityduration = meanimmunityduration;
    this.contactRate = contactRate;
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
    {
      int _cnt = 
this.populationSize 
;
      for ( int i = population.size(); i < _cnt; i++ ) {
        instantiate_population_xjal( i );
      }
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "network_test_mod.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Environments setup
    {
      double _x_xjal = 
500 
;
      double _y_xjal = 
500 
;
      double _z_xjal = 
0 
;
      setupSpace( _x_xjal, _y_xjal, _z_xjal );
    }
    disableSteps();
    {
      double _v1_xjal = 
75 
;
      setNetworkAllInRange( _v1_xjal );
    }
    setLayoutType( LAYOUT_USER_DEFINED );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    population.setEnvironment( this );
    for ( int i = 0; i < population.size(); i++ ) {
      person _a = population.get(i); 
      setupParameters_population_xjal( _a, i, null );
      doBeforeCreate_population_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
1 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1 
;
	  _e.setHeight( _height, METER );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics && tryExt(ExtAgentWithSpatialMetrics.class) == null ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    applyNetwork();
    for (Agent embeddedObject : population) {
      embeddedObject.startAsEmbedded();
    }
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( population );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    for (Agent _item : population) {
      _item.onDestroy();
    }
    // On destroy code
    
 
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    for (Agent _item : population) {
      _item.doFinish();
    }
  }

  // Additional class code

 
  // End of additional class code


}
