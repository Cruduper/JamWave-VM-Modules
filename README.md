 # _JamWave Voltage Modular Code_  

---
## 🌐 About the Project     
This is free, open source code that can added to Cherry Audio's Voltage Module Designer in order to make synthesizer and FX Modules for their Voltage Modular system. 
<br><br/> 

### 📖 Description

<br><br/>
### 🛠 Technologies Used

* _Java_
* _Voltage Module Designer_

<br><br/>

### 🦠 Known Bugs OR Issues

## 🏁 Getting Started

### ⚙️ Setup/Installation Requirements

* _Buy, download, and install [Voltage Module Designer (VMD)](https://cherryaudio.com/products/voltage-module-designer)_
* _Create a new module inside Module Designer `file > new`_
* _Because VMD locks most of the boilerplate code inside it's editor and only allows you to edit the code in specific user-definable functions, the source code in this repo omits the boilerplate and only contains the snippets of code from the user-definable sections, for your convenience. The portions you will want to copy/paste are the parts directly underneath the `// add your own code here` comments. Some surrounding boilerplate code is kept to make it easier to see which part of the editor code you will need to navigate to in order to paste, but this boilerplate is commented out._
  * _Inside VMD, you can easily skip around to all user-definable functions in the code (`Initialize()`, `Notify()`, `ProcessSample()`, etc) by clicking the corresponding entries in the `Module` window. 
* _In the `// Auto-generated variables` there will be a separate variable for every UI element on the plugin (knobs, sliders, jacks, etc). You will have to manually add each of these elements on to the UI of your plugin, but dragging them one at a time from the `controls` window to the `module` window_
  * _Take note of the naming of the variables of all of the UI elements in code (eg "inputJack1"). When you manually drag UI elements onto your module, you'll have to make sure they are named the same in the `properties` window as they are named in code. You can check the name of a UI element by clicking on it, then looking at the `Variable Name` setting_ 
  * _You may want the `Variable Name`, `Internal Name`, and `Display Name` to all be the same, to avoid any confusion_
* _Once you have copy/pasted all the parts of the code here, and recreated the UI elements and named them correctly, go to the menu `Build > Build` (or hit F7)_
* _Once building is complete, go to `Build > Run without Debugger` (or hit ctrl + F5)_
* _The module should open up in a test environment where you can test its operation_


## ⚖️ License

[MIT](https://opensource.org/licenses/MIT)    

```
MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

Use at your own risk. You are liable for any damage to your ears or audio equipment in the case of malfunction or louder than expected volume changes. Use lower volume levels and output clipping protection when experimenting with audio.  

If you have any issues or questions contact me at briefcasemanx@gmail.com.    
Copyright (c) _2022_  _Eric Crudup_

<center><a href="#">Return to Top</a></center>