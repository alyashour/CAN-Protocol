# CAN-Protocol
The primary Data Class is the Frame class (I'm thinking of renaming it DataFrame).
I've added as much exception handling as I can think of, it should explain the error 95% of the time.
See the Main file for a short example of how the Frame class works.

~~I haven't figured out a way to do exactly what I wanted with the identification inheritance but it works and I will be improving it asap.~~
Done.
# Issues
- Overload Frame constructors.
- Move Data & ID into Frame class as subclasses
- Increase max Data size above 4 bytes
- Add codes to ID
  - WIP
- Add State subclasses extending ID (or maybe ID implementing states)
  - Done
