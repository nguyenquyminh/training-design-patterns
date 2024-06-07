Imagine this is a image processing application, you have a lot of sub-system to help process the image (e.g. load image, then filter, then save).
So if the dev wants to use the image process feature, the complexity of interacting with these sub-systems can overwhelm developers.

Task:
- Apply the Facade pattern to provide a simplified interface that make it easier for devs to use the image process feature.