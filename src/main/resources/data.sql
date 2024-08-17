-- SQL script to populate the DEFINITION_TABLE with dummy data

INSERT INTO DEFINITION_TABLE (word, definition, example) VALUES
    ('Algorithm', 'A step-by-step procedure for solving a problem or accomplishing some end.', 'An algorithm for sorting numbers.'),
    ('Encapsulation', 'The bundling of data with the methods that operate on that data.', 'Encapsulation is a core concept in object-oriented programming.'),
    ('Inheritance', 'A mechanism to allow one class to derive properties and behavior from another class.', 'Inheritance allows code reuse through derived classes.'),
    ('Polymorphism', 'The ability of different objects to respond, each in its own way, to identical messages.', 'Polymorphism allows methods to do different things based on the object it is acting upon.'),
    ('Abstraction', 'The concept of hiding the complex implementation details and showing only the necessary features of an object.', 'Abstraction helps to reduce complexity by focusing on the high-level operations.')
;
