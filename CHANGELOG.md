Change Log
==========
Version 2.1.3
--------------------------
- Fixed possible deadlock when trying to update store while iterating

Version 2.1.1
--------------------------
- Added `remove(key)` to `StoreWriter<K,V>` and `StoreInitializer<K,V>`

Version 2.1.0
--------------------------
- New StoreRW interface for reading and writing
- Simplified serializers
- Configuration is now using generics as well.
- Small performance improvements

Version 2.0.1
--------------------------
- Fixed memory mapped files leak when closing the file

Version 2.0.0
--------------------------
- Bumped minimal java version to java 13
- StoreReader and StoreWriter implement AutoCloseable
- New config builder
- Reader and writer use generics
- Reader is now fully thread-safe
- Bloom filters could be used for better performance


Version 1.2.0 *(June 26th 2016)*
--------------------------

### Bugfixes

- Custom serializers with interfaces as types don't work (#25)
- Fix exception handling (#15)
- Fix concurrent database access with multiple instances (#26)

Version 1.1.0 *(January 8th 2016)*
--------------------------

### New features

- Implement a StoreReader.keys() method (#13)

### Bugfixes

- Fixes the return type of apis (#9)
- A Exception Using reader.iterable() (#16)

### Performance improvements

- Share slot read buffers (#14)

### Compatibility

The prefix bytes have been modified (#21) as they were confusing so exceptionally this version breaks store compatibility with 1.0.0. This shouldn't happen anymore in the future for minor versions.

Version 1.0.0 *(July 1st 2015)*
--------------------------
 *  First public release