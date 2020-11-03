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

 

public class person extends Agent
{
  // Parameters
  // Plain Variables

 
  public 
Color 
 color;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( person.class );
  
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
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<InfectionStatechart_state> InfectionStatechart = new Statechart<>( this, (short)2 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.InfectionStatechart) return "InfectionStatechart";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.InfectionStatechart) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.InfectionStatechart ) {
       Statechart<InfectionStatechart_state> self = this.InfectionStatechart;
       
 
;
      enterState( Susceptible, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum InfectionStatechart_state implements IStatechartState<person, InfectionStatechart_state> {
    Susceptible,
    Exposed,
    Infected,
    Recovered;

    @AnyLogicInternalCodegenAPI
    private Collection<InfectionStatechart_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<InfectionStatechart_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<InfectionStatechart_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<InfectionStatechart_state> getSimpleStatesDeep() {
      Collection<InfectionStatechart_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<InfectionStatechart_state> getFullState() {
      Set<InfectionStatechart_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<InfectionStatechart_state> getStatesInside() {
      Set<InfectionStatechart_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<InfectionStatechart_state> getStatechart( person _a ) {
      return _a.InfectionStatechart;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionStatechart_state Susceptible = InfectionStatechart_state.Susceptible;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionStatechart_state Exposed = InfectionStatechart_state.Exposed;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionStatechart_state Infected = InfectionStatechart_state.Infected;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionStatechart_state Recovered = InfectionStatechart_state.Recovered;


  @AnyLogicInternalCodegenAPI
  private void enterState( InfectionStatechart_state self, boolean _destination ) {
    switch( self ) {
      case Susceptible:
  	    logToDBEnterState(InfectionStatechart, self);
        // (Simple state (not composite))
        InfectionStatechart.setActiveState_xjal( Susceptible );
        {
color = green; 
;}
        transition.start();
        return;
      case Exposed:
  	    logToDBEnterState(InfectionStatechart, self);
        // (Simple state (not composite))
        InfectionStatechart.setActiveState_xjal( Exposed );
        {
color = yellow; 
;}
        gettinginfected.start();
        return;
      case Infected:
  	    logToDBEnterState(InfectionStatechart, self);
        // (Simple state (not composite))
        InfectionStatechart.setActiveState_xjal( Infected );
        {
color = red; 
;}
        recovery.start();
        contact.start();
        return;
      case Recovered:
  	    logToDBEnterState(InfectionStatechart, self);
        // (Simple state (not composite))
        InfectionStatechart.setActiveState_xjal( Recovered );
        {
color = magenta; 
;}
        waningimmunity.start();
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( InfectionStatechart_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case Susceptible: 
  	    logToDBExitState(InfectionStatechart, self);
  	    logToDB(InfectionStatechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition) transition.cancel();
        {
 
;}
        return;
      case Exposed: 
  	    logToDBExitState(InfectionStatechart, self);
  	    logToDB(InfectionStatechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != gettinginfected) gettinginfected.cancel();
        {
 
;}
        return;
      case Infected: 
  	    logToDBExitState(InfectionStatechart, self);
  	    logToDB(InfectionStatechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != recovery) recovery.cancel();
        if ( !_source || _t != contact) contact.cancel();
        {
 
;}
        return;
      case Recovered: 
  	    logToDBExitState(InfectionStatechart, self);
  	    logToDB(InfectionStatechart, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != waningimmunity) waningimmunity.cancel();
        {
 
;}
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( InfectionStatechart_state _destination ) {
    InfectionStatechart_state _state = InfectionStatechart.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout gettinginfected = new TransitionTimeout( this );
  public TransitionTimeout waningimmunity = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == gettinginfected ) return "gettinginfected";
    if ( _t == waningimmunity ) return "waningimmunity";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == gettinginfected ) return InfectionStatechart;
    if ( _t == waningimmunity ) return InfectionStatechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionTimeout _t ) {
    if ( _t == gettinginfected ) return 
 
;
    if ( _t == waningimmunity ) return 
 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == gettinginfected ) {
      exitState( Exposed, self, true );
      {
 
;}
          enterState( Infected, true );
      return;
    }
    if ( self == waningimmunity ) {
      exitState( Recovered, self, true );
      {
 
;}
          enterState( Susceptible, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == gettinginfected ) {
      _value = 
1.0/main.meanlatencyduration 
;
      _value = toModelTime( _value, MINUTE );
      return _value;
    }
    if ( _t == waningimmunity ) {
      _value = 
main.meanimmunityduration 
;
      _value = toModelTime( _value, MINUTE );
      return _value;
    }
    return super.evaluateTimeoutOf( _t );
  }


  public TransitionRate recovery = new TransitionRate( this );
  public TransitionRate contact = new TransitionRate( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionRate _t ) {
    if ( _t == recovery ) return "recovery";
    if ( _t == contact ) return "contact";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionRate _t ) { 
    if ( _t == recovery ) return InfectionStatechart;
    if ( _t == contact ) return InfectionStatechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionRate _t ) {
    if ( _t == recovery ) return 
 
;
    if ( _t == contact ) return 
 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionRate self ) {
    if ( self == recovery ) {
      exitState( Infected, self, true );
      {
 
;}
          enterState( Recovered, true );
      return;
    }
    if ( self == contact ) {
      {
sendToRandomConnected("Infected"); 
;}
      contact.start();
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateRateOf( TransitionRate _t ) {
    double _value;
    if ( _t == recovery ) {
      _value = 
1.0/main.meaninfectionduration 
;
      _value = toModelRate( _value, PER_MINUTE );
      return _value;
    }
    if ( _t == contact ) {
      _value = 
main.contactRate 
;
      _value = toModelRate( _value, PER_MINUTE );
      return _value;
    }
    return super.evaluateRateOf( _t );
  }

  public TransitionMessage transition = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == transition ) return "transition";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == transition ) return InfectionStatechart;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testGuardOf( TransitionMessage _t ) {
    if ( _t == transition ) return 
 
;
    return super.testGuardOf(  _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == transition ) {
      exitState( Susceptible, self, true );
      {
        Object msg = (Object) _msg;
 
;}
          enterState( Exposed, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == transition ) {
      
Object 
msg = (Object) _msg;
      return true;
    }
    return super.testMessageOf( _t, _msg );
  }
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
  protected static final int _shapeBody = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.0, -1.0, -2.0, -1.0, 0.0, 1.0, 4.0, 6.0, 6.0, 6.0, 5.0, 1.0, 4.0, 4.0, 4.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, 2.0, 3.0, 3.0, 9.0, 17.0, 17.0, 11.0, 11.0, 10.0, 3.0, 3.0, 2.0, 4.0, 0.0, -3.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(person);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _shapeBody:
        if (true) {
          ShapeCurve self = this.shapeBody;
          
this.send("Infected", this); 
        }
        break;
      case _person:
        if (true) {
          ShapeGroup self = this.person;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index ) {
    switch( _shape ) {
      case _person:
          
 
        break;
      default:
        super.onShapeGroupDraw( _shape, index );
        break;
    }
  }
  
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _shapeBody_SetDynamicParams_xjal( ShapeCurve shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
color 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
    shape.setNPoints(
 
);
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDx( indexPt, 
 
);
     }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDy( indexPt, 
 
);
    }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDz( indexPt, 
 
);
    }
 	}
  }
  
  protected ShapeCurve shapeBody;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _person_SetDynamicParams_xjal( ShapeGroup shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotationY(
 
);
    shape.setRotationX(
 
);
    shape.setRotationZ(
 
);
 	}
  }
  
  protected ShapeGroup person;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBody = new ShapeCurve(
      true,-2.0, -7.0, 
      null, black,
      18, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    ) {
      @Override
      public void updateDynamicProperties() {
        _shapeBody_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public boolean onClick( double clickx, double clicky ) {
        return onShapeClick( _shapeBody, 0, clickx, clicky );
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    person = new ShapeGroup( person.this, SHAPE_DRAW_2D, true, 10.0, 20.0, 0.0, 0.0
	
	     , shapeBody ) {
      @Override
      public void updateDynamicProperties() {
        _person_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _person, 0 );
      }
    };

    }
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
  public person( Engine engine, Agent owner, AgentList<? extends person> ownerPopulation ) {
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
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public person() {
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_person_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( person.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( person.this, getElementProperty( "network_test_mod.person.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( person.class );
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
    InfectionStatechart.start();
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
    setupPlainVariables_person_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_person_xjal() {
    color = 
black 
;
  }

  // User API -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Read-only variable. <em>Shouldn't be modified by user.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient network_test_mod.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( true, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

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

  public AgentList<? extends person> getPopulation() {
    return (AgentList<? extends person>) super.getPopulation();
  }

  public List<? extends person> agentsInRange( double distance ) {
    return (List<? extends person>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    InfectionStatechart.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    InfectionStatechart.onDestroy();
    // On destroy code
    
 
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code


}
