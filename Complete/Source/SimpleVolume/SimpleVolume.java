/**************  SPECIAL NOTE  ***************

NOTE: for the "Auto Generated Variables" section, you must add each the UI elements shown there to your module MANUALLY inside Module Designer! This code will then autogenerate. Make sure the names match between the code shown below, and the code in your editor. You may need to adjust the names of individual knobs and elements. See instructions in Github repo's README. 

**********************************************/



// public void Initialize()
// {
   // add your own code here
   volume1Value = volumeKnob1.GetValue();
// }



// public boolean Notify( VoltageComponent component, ModuleNotifications notification, double doubleValue, long longValue, int x, int y, Object object )
// {
   // add your own code here
  //  switch( notification )
  //  {
  //     case Knob_Changed:
  //     {
         if (component == volumeKnob1){
            volume1Value = doubleValue;
         }
  //     }
  //     break;
  //  }
// }



// @Override
// public void ProcessSample()
// {
   // add your own code here
   double inputSignal = inputJack1.GetValue();
   double outputSignal = inputSignal * volume1Value;
   outputJack1.SetValue(outputSignal);
// }


// Auto-generated variables 
private VoltageAudioJack outputJack1;
private VoltageAudioJack inputJack1;
private VoltageKnob volumeKnob1;


// Add your own variables and functions here
private double volume1Value;