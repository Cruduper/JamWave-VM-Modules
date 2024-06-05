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


// (NOTE: Add these UI controls manually! This code will then autogenerate!)
// Auto-generated variables 
private VoltageAudioJack outputJack1;
private VoltageAudioJack inputJack1;
private VoltageKnob volumeKnob1;


// Add your own variables and functions here
private double volume1Value;