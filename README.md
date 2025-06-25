# Subnito – Smart VLSM Calculator for Efficient Subnetting

Subnito is a smart and intuitive VLSM (Variable Length Subnet Masking) calculator built to make subnetting **fast**, **accurate**, and **hassle-free**. Whether you're a networking student, system administrator, or IT professional, Subnito helps you design subnets with precision and clarity.

## 🔍 Why VLSM?

Traditional subnetting often splits networks into equal-sized blocks, leading to wasted IP addresses. **VLSM** allows for **variable-sized subnets** within the same network—enabling more efficient IP address allocation based on actual host requirements.

Subnito takes this a step further by automating and visualizing the process.

---

## ✨ Key Features

- ✅ **Two Interfaces**:
  - **CLI Tool**: Terminal-based and script-friendly—ideal for professionals who love the command line.
  - **GUI App**: A Java Swing interface designed for ease of use and accessibility, with built-in CSV export.

- 🧠 **Smart Subnet Optimization**:
  - Automatically sorts subnets by size for efficient address space usage.
  - Real-time calculation of utilization metrics.

- 🛠️ **User-Centric Design**:
  - Custom subnet naming with duplicate name checks.
  - Full input validation and clear error messages.
  - Clean, readable output: subnet address, subnet mask, broadcast address, and usable IP range.

- 📤 **CSV Export** (GUI Only):
  - Export your results for documentation, reporting, or learning purposes.

- 💪 **Scalable and Capable**:
  - Supports complex scenarios with up to **1000 subnets**.

---

## 🚀 Benefits

- **Calculate optimal subnets** based on your IP block and host needs.
- **Visualize** all key subnetting information in real time.
- **Save time** and eliminate manual errors.
- **Learn** and apply efficient network design principles.
- **Switch easily** between CLI for speed and GUI for accessibility.

> Subnet smart. Subnet fast. Subnet with **Subnito**.

---

## 🛠️ Technologies Used

- Java 17+
- Java Swing (for GUI)
- CSV Export with built-in I/O handling

---

## 📦 Installation & Usage

### Requirements
- Java 17 or higher

### CLI Version

```bash
javac VlsmCli.java
java VlsmCli
```

### GUI Version

```bash
javac Subnito.java
java Subnito
```

---

## 📁 Example Output

**For Each Subnet**:
- Subnet Name
- Network Address
- Subnet Mask
- Broadcast Address
- Usable IP Range
- Number of Hosts

---

## 👥 Authors

Developed by:
- Mohamed Aziz Mhenni
- Fedi Brinsi
