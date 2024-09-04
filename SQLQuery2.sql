INSERT INTO Dentist (Number, Name, Nationality, RoomNumber, Salary, BirthDate, Box, City, Zip)
VALUES (1, 'Dr. John Doe', 'USA', '101', 120000.00, '1970-01-01', '123', 'New York', '10001');

-- Insert into Client (Self-paying)
INSERT INTO Client (Code, Name, HomePhone, WorkPhone, Address, BirthDate, IsInsured, DentistNumber)
VALUES ('C001', 'Jane Doe', '555-1234', '555-5678', '123 Main St', '1985-02-15', 0, 1);

-- Insert into BankAccount for the Client
INSERT INTO BankAccount (ClientCode, BankName, BankAccountNumber)
VALUES ('C001', 'Chase', '123456789');

-- Insert into Client (Insured)
INSERT INTO Client (Code, Name, HomePhone, WorkPhone, Address, BirthDate, IsInsured, DentistNumber)
VALUES ('C002', 'John Smith', '555-9876', '555-5432', '456 Elm St', '1990-03-10', 1, 1);

-- Insert into Insurance for the Client
INSERT INTO Insurance (ClientCode, CompanyName, CompanyPhone)
VALUES ('C002', 'HealthCare Inc.', '555-6789');

-- Insert into Appointment
INSERT INTO Appointment (Date, Type, Action, Fee, DateOfNextAppointment, ClientCode, DentistNumber)
VALUES ('2024-09-04', 'Checkup', 'Routine Checkup', 100.00, '2024-12-04', 'C001', 1);
